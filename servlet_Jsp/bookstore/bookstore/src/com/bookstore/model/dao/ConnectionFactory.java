package com.bookstore.model.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection connection=null;
	private ConnectionFactory() {
		
	}
	public static Connection getConncetion() {
		InputStream is=ConnectionFactory.class.getClassLoader().getResourceAsStream("db1.properties");
		Properties p=new Properties();
		try {
			p.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String driver=p.getProperty("db.driver");
		 String url=p.getProperty("db.url");
		 String username=p.getProperty("db.username");
		 String password=(String) p.setProperty("password", "");
		
		 
		 //I am doing this driver loading using listener
		 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		 try {
			
			connection = (Connection) DriverManager.getConnection(url,username,password);
		 }catch (Exception e) {
			// TODO: handle exception
		}
		
		return connection;
		
	}
}
