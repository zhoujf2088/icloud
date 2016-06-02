package test;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.cloud.cases.entity.RoleEntity;
import com.cloud.cases.util.StringUtil;
import com.sun.org.glassfish.gmbal.Description;

public class test01 {

	public static void main(String[] args) throws Exception {
       
//		test1();
//		test2();
		test3();
	}
	
	public static void test1() throws ClassNotFoundException, NoSuchMethodException, SecurityException{
		 Map<String,String> mym= new HashMap<String,String>();
	        Set s1 = new HashSet<>();
	        Set s2 = new HashSet<>();
	        mym.put("key1","myvalue");
	        mym.put("key2","myvalue4");
	        mym.put("key3","myvalue6");
			System.out.println("Integer.MIN_VALUE:"+Integer.MIN_VALUE);
			System.out.println("Integer.MAX_VALUE:"+Integer.MAX_VALUE);
			
			Random r=new Random();
			long starttime=System.currentTimeMillis();
			int count=500000;
			for (int i = 0; i < count; i++) {
				s1.add(r.nextInt());
				s2.add(Math.random());
			}
			System.out.println("随机数取"+count+"次，用时："+(System.currentTimeMillis()-starttime)+"毫秒,s1.size--Random:"+s1.size()+",s2.size---Math.random:"+s2.size());
			//Thread.sleep(1000);
			for (Map.Entry<String, String> entry : mym.entrySet()) {
				   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
				  }
			RoleEntity role =new RoleEntity();
			System.out.println(role.getClass().getName());
			System.out.println(role.getClass().getCanonicalName());
			System.out.println(RoleEntity.class.getName());
			
			Class<?> cls = Class.forName("com.cloud.cases.entity.UserBaseInfoEntity"); //或直接XXXX.class
			String name = cls.getAnnotation(Table.class).name();
			String s =cls.getAnnotation(Table.class).schema();
			System.out.println("Table.class.schema:"+s);
			String name2 = cls.getAnnotation(Entity.class).name();
			String name3 = cls.getAnnotation(Description.class).value();
			System.out.println("description:"+name3);
			Method  method= cls.getMethod("getUsername");
			String methodname= method.getAnnotation(Column.class).name();
			System.out.println("tablename:"+name);
			System.out.println("Entity.class.name:"+name2);
			System.out.println("methodname--Column.class:"+methodname);
			System.out.println(StringUtil.encrypt("zjf", "zjf123").toString());
	}

	public static void test2(){
	Properties pro=	System.getProperties();System.out.println();
		pro.list(System.out);
	}
	public static void test3(){
		File f = new File("c:/");
		File f1[]=f.listRoots();
		for (File file : f1) {
			System.out.println(file.toString());
		}

		
		}
}
