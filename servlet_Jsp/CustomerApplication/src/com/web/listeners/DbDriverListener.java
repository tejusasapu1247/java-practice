package com.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DbDriverListener implements ServletContextListener {

   
    public void contextDestroyed(ServletContextEvent sce)  { 
    }

    public void contextInitialized(ServletContextEvent sce)  { 
        String driver=sce.getServletContext()
         		.getInitParameter("driverName");
        try {
        	Class.forName(driver);
        	 System.out.println("..driver is loaded...");
        }catch (Exception e) {
			e.printStackTrace();
		}
       
        
        
    }
	
}
