package com.bookstore.dao;
import java.sql.SQLException;
import java.util.*;
public interface BookDao {
//	public void addBook(Book book) throws SQLException;

	List<Book> getAllBooks();
	
}
