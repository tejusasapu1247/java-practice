package com.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DemoScrollableRs {

	public static void main(String[] args) {
		Connection connection=ConnectionFactory.getConncetion();
		try {
			Statement stmt=(Statement) connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
		rs.absolute(4);//go to 4 th tuple in table  
		rs.updateString(2, "Jaanu");//update the string 4 in table
		rs.updateRow();
		
		//reset to print emp rec again
		rs.beforeFirst();//go to the first tuple
		System.out.println(".................");
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	
	
	}

}
