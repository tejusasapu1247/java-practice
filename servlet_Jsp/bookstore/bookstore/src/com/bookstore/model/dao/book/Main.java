package com.bookstore.model.dao.book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BookDao dao=new BookDaoImpl();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
//		System.out.println("...adding customer.....");
//		try {
//			Date pdate=formatter.parse("01/01/2019");
//			Book book=new Book("ND3", "java", "Ajith", pdate, 2000);
//			dao.addBook(book);
//			System.out.println("..........................");
//			
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
//		System.out.println("...adding customer 2.....");
//		try {
//			Date pdate=formatter.parse("05/01/2019");
//			Book book=new Book("ND8", "java", "Ajith", pdate, 2030);
//			dao.addBook(book);
//			System.out.println("..........................");
//			
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

//		System.out.println("...getting by id.....");
//		 Book book=dao.getBookById(2);
//		 System.out.println(book);
//		 
		 System.out.println("...getting all customers......"); 
		List<Book> customers=dao.getAllBooks();
		customers.forEach(System.out::println);
		
//		Book delbokk=dao.delBook(5);
//		System.out.println("deleted book is  :"+delbokk);
//		
//		Book updatedbook=dao.updateBook(3,3000);
//		System.out.println("updated book is  :"+updatedbook);
//		
		
		 System.out.println("...getting all customers......"); 
			List<Book> upadtedcustomers=dao.getAllBooks();
			upadtedcustomers.forEach(System.out::println);

		
	}

}
