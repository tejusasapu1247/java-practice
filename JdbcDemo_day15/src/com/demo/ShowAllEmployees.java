package com.demo;

import java.sql.*;

import com.mysql.jdbc.Connection;

public class ShowAllEmployees {
	public static void main(String[] args) {

		/*
		 * If we are using JDBC 4.0 means classpath can easilly load the driver
		 * internally we need not to load the driver externally...
		 */

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("driver is loaded...");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Connection connection = null;
		ResultSet rs = null;
		try {
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl_batch5", "root", "");
			Statement statement = connection.createStatement();
			rs = statement.executeQuery("select * from sm2");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + " : " +
						rs.getString(2) + " : " + 
						rs.getInt(3) + " : " + 
						rs.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			try {
				connection.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
