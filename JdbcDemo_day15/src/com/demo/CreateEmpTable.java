package com.demo;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class CreateEmpTable {
	public static void main(String [] args) {
		
	Connection connect;
	try {
		connect=ConnectionFactory.getConncetion();
		connect.setAutoCommit(false);
		PreparedStatement pst=(PreparedStatement) connect.prepareStatement("create table Employee(ename varchar(30)not null,eid int not null)");
		pst.executeUpdate();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
