package com.lab6Assignment.question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookCollection {
	List<Book> books = new ArrayList<Book>();
		
		public void hasBook(Book book){
			if(books.contains(book))
				System.out.println("book is available");
			else
				System.out.println("book is not available");
		}
		@SuppressWarnings("unchecked")
		public void SortByBookName(){
			Collections.sort(books,new sortByBookName());	
			display();
		}
		@SuppressWarnings("unchecked")
		public void SortByBookAuthor( ){
			Collections.sort(books,new sortByBookAuthor());
			display();
		}
		public void display() {
			books.stream().forEach(System.out::println);
		}
		
	}



