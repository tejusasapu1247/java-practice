package com.demo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class HowToReturnAutoGenKeyAndPlayWithDate {

	public static void main(String[] args) {
		final String Add_Book_Query=
				"insert into books(isbn, title, author, pubDate, price) values (?,?,?,?,?)";
		LocalDate date=LocalDate.of(2011, Month.JANUARY, 1);
		try {
		Connection connect =ConnectionFactory.getConncetion();
		PreparedStatement pst=(PreparedStatement) connect.prepareStatement(Add_Book_Query, Statement.RETURN_GENERATED_KEYS);
		pst.setString(1, "456S");
		pst.setString(2, "C programming");	
		pst.setString(3, "guruvu garu");
		pst.setObject(4,date);
		pst.setDouble(5,1000.9);
		pst.executeUpdate();
		System.out.println("...done....");	
		
		ResultSet rs=pst.getGeneratedKeys();
		if(rs.next()) {
			System.out.println(rs.getInt(1));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
