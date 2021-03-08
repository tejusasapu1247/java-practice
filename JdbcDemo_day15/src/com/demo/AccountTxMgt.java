package com.demo;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class AccountTxMgt {
public static void main(String [] args) {
	Connection con=null;
	try {
		con=ConnectionFactory.getConncetion();
		con.setAutoCommit(false);
		PreparedStatement pst=(PreparedStatement) con.prepareStatement("update account set balance=balance-10 where id=?");
		pst.setInt(1,1);
		pst.executeUpdate();
	
		PreparedStatement pst1=(PreparedStatement) con.prepareStatement("update account set balance=balance+10 where id=?");
		pst1.setInt(1,2);
		pst1.executeUpdate();
		con.commit();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
