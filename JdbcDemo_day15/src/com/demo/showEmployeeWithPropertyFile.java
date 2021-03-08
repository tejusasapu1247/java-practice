package com.demo;

import java.io.*;
import java.sql.*;
import java.util.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class showEmployeeWithPropertyFile {

	public static void main(String[] args){
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
		
		 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 Connection connection=null;
		 ResultSet rs=null;
		 try {
		
		 connection = (Connection) DriverManager.getConnection(url,username,password);
			Statement statement = (Statement) connection.createStatement();
			rs = statement.executeQuery("select * from sm2");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getInt(3) + " : " + rs.getString(4));
			}
		 }
		 catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
