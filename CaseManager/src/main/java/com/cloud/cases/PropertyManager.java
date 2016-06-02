package com.cloud.cases;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.dom4j.Document;
import org.springframework.beans.BeanUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cloud.cases.entity.MenuEntity;
import com.cloud.cases.util.Constant;
import com.cloud.cases.util.LogUtil;
import com.cloud.cases.util.ProjectUtil;
import com.cloud.cases.vo.MenuVO;

/*
 * Property管理对象
 */
public final class PropertyManager {
	
//	private Document document;
    /**
     * xml配置：项目的home目录
     */
    public static final String XML_SPACEHOME = "casemanager/Home";
    /**
     * xml配置：不包括的url
     */
    public static final String XML_EXCLUDEAUTHURLS = "casemanager/excludeAuthUrls";
    /**
     * xmlProperty
     */
    private static Map<String, String> xmlProperty = new ConcurrentHashMap<String, String>();
    /**
     * dbProperty
     */
    private static Map<String, String> dbProperty = new ConcurrentHashMap<String, String>();
    /**
     * 配置文件路径
     */
    private static final File PROJECT_CONFIG_FILE = new File(Thread
            .currentThread().getContextClassLoader().getResource(
                    "project-config.xml").getFile());
    
	//实例你该对角
	private static PropertyManager instance=new PropertyManager();
	//菜单
	private static Map<Integer, MenuVO> menus=null;
	//私有化默认构造函数
	private PropertyManager(){}

	//获取实例
	public static PropertyManager getInstance() {
		return instance;
	}

	private static void loadMenus(){
		menus=new HashMap<Integer,MenuVO>();
		List<Object[]> objects=null;
		//获取实体管理器
		EntityManager em= ProjectUtil.getEntityManager();
		String sqlstr ="SELECT sub_,parent_ FROM MenuEntity sub_ LEFT JOIN sub_.parentMenu parent_ ORDER BY sub_.id ASC";
		try{
			Query query = em.createQuery(sqlstr);
			objects=query.getResultList();
			//定义子菜单submenu、父菜单parent的vo
			MenuVO submenuvo,parentmenuvo;
			for(Object[] objs : objects){
				//从menus中查询submenuvo
				submenuvo=menus.get(((MenuEntity)objs[0]).getId());
				//如果submenuvo为null
				if(submenuvo==null){
					submenuvo=new MenuVO();
					BeanUtils.copyProperties(objs[0],submenuvo);
				}
				if(objs[1]!=null){
					//从menus中查询parentmenuvo
					parentmenuvo=menus.get(((MenuEntity)objs[1]).getId());
					//如果parentmenuvo为null
					if(parentmenuvo==null){
						parentmenuvo=new MenuVO();
						BeanUtils.copyProperties(objs[1],parentmenuvo);
						menus.put(parentmenuvo.getId(), parentmenuvo);
					}else{ //不为null
						//如果parentmenuvo的子菜单列表不为空
						if(parentmenuvo.getSubMenuVOs()==null){
							parentmenuvo.setSubMenuVOs(new ArrayList<MenuVO>());
						}
						//把子菜单添加到子菜单列表中
						parentmenuvo.getSubMenuVOs().add(submenuvo);
					}
					submenuvo.setParentMenuVO(parentmenuvo);
				}
				menus.put(submenuvo.getId(),submenuvo);
			}
			
		}catch(Exception e){
			LogUtil.error(e);
		}
		finally{
			em.close();
		}
	}
	
	//读取菜单
	public static List<MenuVO> getPublicMenus(final int menuindex){
		//如果menus为空
		if(menus==null){
			loadMenus();
		}
		return menus.get(menuindex).getSubMenuVOs();
	}

	
	//重新读取菜单数据表
	public static void reloadMenus(){
		loadMenus();
		HttpServletRequest request =  ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session=request.getSession();
		session.removeAttribute(Constant.INNER_MENU_LIST);
	}
	
	//
}
