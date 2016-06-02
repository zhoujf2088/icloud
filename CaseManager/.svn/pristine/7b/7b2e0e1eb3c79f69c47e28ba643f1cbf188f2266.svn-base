package com.cloud.cases.util;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletContext;
import java.io.File;

/**
 * Created by tang64 on 2015/10/28.
 */
public class ProjectUtil {

    //定义spring 上下文
    private static ApplicationContext applicationContext;
    private static ThreadLocal<EntityManager> threadLocal = new ThreadLocal<EntityManager>();
    private static EntityManagerFactory emf = null;

    //私有化构造函数
    private ProjectUtil(){

    }

    //初始化项目上下文
    public static void initSpringContext(ServletContext servletContext){
        //通过spring的工具类WebApplicationContextUtils获取ServletContext中的spring上下文
        applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        //从applicationContext中获取EntityManagerFactory
        emf = (EntityManagerFactory)applicationContext.getBean("entityManagerFactory");
    }

    //从applicationContext中获取bean
    public static Object getSpringBena(String key){
        return applicationContext.getBean(key);
    }

    //从ThreadLocal中获取EntityManager,并且同步
    public static synchronized EntityManager getEntityManager(){
        EntityManager em = threadLocal.get();
        if(em == null || em.isOpen()){
            em = emf.createEntityManager();
            threadLocal.set(em);
        }
        return em;
    }

    //关闭实体管理器
    public static void closeEntityManager(){
        EntityManager em=threadLocal.get();
        threadLocal.set(null);
        if(em!=null)
            em.close();
    }

    //开启事务
    public static void beginTransaction(){
        getEntityManager().getTransaction().begin();
    }

    //提交事务
    public static void commit(){
        getEntityManager().getTransaction().commit();
    }

    //回滚事务
    public static void rollback(){
        getEntityManager().getTransaction().rollback();
    }

    //强制创建一个文件目录
    public void forceCreateDir(File file){
        if(file.exists())
            return;
        String parentDirStr = file.getParent();
        if(parentDirStr!=null){
            File parentFile=new File(parentDirStr);
            if(!parentFile.exists())
                forceCreateDir(parentFile);
        }
        if(!file.mkdir()){
            LogUtil.warn(file.getAbsolutePath()+"make dir error");
        }
    }
    
    //获取文件的Home目录
    public static File getHomeDir(){
    	return null;
    }
}
