package com.demo;
import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
       
    }

    public void contextInitialized(ServletContextEvent event)  { 
       ServletContext sc=event.getServletContext();
       String dog=sc.getInitParameter("doggy");
    	Dog d=new Dog("puppy");
    	sc.setAttribute("dog", d);
        
        
    }
	
}
