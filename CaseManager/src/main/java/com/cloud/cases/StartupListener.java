package com.cloud.cases;

import com.cloud.cases.util.ProjectUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class StartupListener implements ServletContextListener {
	public void contextDestroyed(ServletContextEvent sce){
		
	}
	
	public void contextInitialized(ServletContextEvent sce){
		ProjectUtil.initSpringContext(sce.getServletContext());
	}
}
