package com.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class AddEmp {
	public static void main(String [] args) {
	Connection connect=null;
	try {
		connect=ConnectionFactory.getConncetion();
		connect.setAutoCommit(false);
		PreparedStatement pst=(PreparedStatement) connect.prepareStatement("insert into temp(name)values(?)",Statement.RETURN_GENERATED_KEYS);
		
		for(long i=0;i<10;i++) {
			pst.setString(1, "foo"+i);
			pst.addBatch();
			if((i%200)==0) {
				pst.executeBatch();
			}
		}
		
		connect.commit();
		System.out.println("...done...");
		ResultSet rs=pst.getGeneratedKeys();
		if(rs.next()) {
			System.out.println(rs.getInt(1));
		}
	} catch (SQLException e) {
		try {
			connect.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		e.printStackTrace();
	}
}
}