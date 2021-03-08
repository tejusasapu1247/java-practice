package com.bookstore.dao;

import java.sql.SQLException;

public class BookDaoImpUsingJdbc implements BookDao {

	@Override
	public void addBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("book is added to db using jdbc.....");
		try
		{
			if(1==1) 
				throw new SQLException();
		}catch (Exception e) {
			// TODO: handle exception
			throw new SQLException(e.getMessage());
		}
	}
	
	}
