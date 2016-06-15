package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.swing.filechooser.FileSystemView;

import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;

import com.cloud.cases.entity.RoleEntity;
import com.cloud.cases.util.Dom4jDemo;
import com.cloud.cases.util.StringUtil;
import com.sun.org.glassfish.gmbal.Description;

public class test01 {

	public static void main(String[] args) throws Exception {
       
		test1();
//		test2();
//		test3();
//		test4();
//		test5();
		driver();
	}
	
	public static void test1() throws ClassNotFoundException, NoSuchMethodException, SecurityException{
		 Map<String,String> mym= new HashMap<String,String>();
	        mym.put("key1","myvalue1");
	        mym.put("key2","myvalue4");
	        mym.put("key3","myvalue6");
			System.out.println("Integer.MIN_VALUE:"+Integer.MIN_VALUE);
			System.out.println("Integer.MAX_VALUE:"+Integer.MAX_VALUE);
			
			Set s1 = new HashSet<>();
			Set s2 = new HashSet<>();
			Random r=new Random();
			long starttime=System.currentTimeMillis();
			int count=500000;
			for (int i = 0; i < count; i++) {
				s1.add(r.nextInt());
				s2.add(Math.random());
			}
			System.out.println("随机数取"+count+"次，用时："+(System.currentTimeMillis()-starttime)+"毫秒,s1.size--Random:"+s1.size()+",s2.size---Math.random:"+s2.size());
			for (Map.Entry<String, String> entry : mym.entrySet()) {
				   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
				  }
			RoleEntity role =new RoleEntity();
			System.out.println(role.getClass().getName());
			System.out.println(role.getClass().getCanonicalName());
			System.out.println(RoleEntity.class.getName());
			
			Class<?> cls = Class.forName("com.cloud.cases.entity.UserBaseInfoEntity"); //或直接XXXX.class
			String name = cls.getAnnotation(Table.class).name();
			String name2 = cls.getAnnotation(Entity.class).name();
			String name3 = cls.getAnnotation(Description.class).value();
			System.out.println("Table.class.schema:"+cls.getAnnotation(Table.class).schema());
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

    public static void test4(){
	   
	   Dom4jDemo dom= new Dom4jDemo();
//	   dom.createXml("D:/ZhouJF/test.xml");
	   dom.parserXml("D:/ZhouJF/test.xml");
	   System.out.println(HttpRequest.class.getName());
//	   dom.parserXml("pom.xml");
   }

    public static void test5() throws IOException{
    BufferedReader bw=new BufferedReader(new InputStreamReader(System.in));
    String line=null;
    while ((line=bw.readLine())!=null) {
		System.out.println(line.toUpperCase());
		if (line.equals("over")) {
			break;
		}
	}
    	bw.close();
    }
    
   public static String FormetFileSize(long fileS) {
       DecimalFormat df = new DecimalFormat("#.00");
       String fileSizeString = "";
       if (fileS < 1024) {
           fileSizeString = df.format((double) fileS) + "B";
       } else if (fileS < 1048576) {
           fileSizeString = df.format((double) fileS / 1024) + "K";
       } else if (fileS < 1073741824) {
           fileSizeString = df.format((double) fileS / 1048576) + "M";
       } else {
           fileSizeString = df.format((double) fileS / 1073741824) + "G";
       }
       return fileSizeString;
   }

   /**
    * 获取硬盘的每个盘符
    */
   public static void driver(){
       // 当前文件系统类
       FileSystemView fsv = FileSystemView.getFileSystemView();
       // 列出所有windows 磁盘
       File[] fs = File.listRoots();
       // 显示磁盘卷标
       for (int i = 0; i < fs.length; i++) {
           System.out.print(fsv.getSystemDisplayName(fs[i]));
           System.out.print("    总大小" + FormetFileSize(fs[i].getTotalSpace()));
           System.out.println("    剩余" + FormetFileSize(fs[i].getFreeSpace()));
       }
   }
   
}
