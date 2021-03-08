package com.demo;

import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class ShowAllEmpWithFactory {

	public static void main(String[] args) {
		try {
			Connection c=ConnectionFactory.getConncetion();
			Statement s=(Statement) c.createStatement();
			ResultSet r=s.executeQuery("select * from emp");
					while (r.next()) {
						System.out.println(
								r.getInt(1) + " : " + r.getString(2) + " : " + r.getInt(3) + " : " + r.getString(4));
					}		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
