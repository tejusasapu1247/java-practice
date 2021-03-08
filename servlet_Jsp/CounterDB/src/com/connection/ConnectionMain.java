package com.connection;

import com.mysql.jdbc.Connection;

public class ConnectionMain {

	public static void main(String[] args) {
		Connection connection=ConnectionFactory.getConnection();
		try {
			if(connection!=null)	System.out.println("successfully connected to database....");
			}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
