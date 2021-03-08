package com.demo;

import java.sql.*;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;

public class DemoStoredProcedure {
	public static void main(String[] args) {

	try {
		Connection con=ConnectionFactory.getConncetion();
		CallableStatement csmt=(CallableStatement) con.prepareCall("call calculator(?,?,?)");
		csmt.setInt(1, 2);
		csmt.setInt(2, 9);
		csmt.registerOutParameter(3, Types.INTEGER);
		csmt.execute();
		System.out.println(csmt.getInt(3));
	}catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
