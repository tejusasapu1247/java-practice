package com.hello;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JdbcDemo extends HttpServlet {
	String driver=null;
	String url=null;
	String email=null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		driver=config.getInitParameter("driverName");
		url=config.getInitParameter("url");
		email=config.getServletContext().getInitParameter("email");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResultSet rs=null;
		Connection con=null;
		
		try {
			Class.forName(driver);
			System.out.println("Driver is loaded...");
		}catch (ClassNotFoundException e) {
			System.out.println("driver not found...");
		}
		try {
			con=(Connection) DriverManager.getConnection(url, "root", "");
			
			Statement stmt=con.createStatement();
			rs= stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + " : " +
						rs.getString(2) + " : " + 
						rs.getString(3) + " : " + 
						rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			try {
				con.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
