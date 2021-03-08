package com.lab6Assignment.question3;
public class BookTester {

	public static void main(String[] args) {
		Book b1=new Book(12, "Java", "Roy");
		Book b2=new Book(1, "Python", "James");
		Book b3=new Book(22, "C programming", "Rohit");
		Book b4=new Book(34, "C++", "Hamanth");
		Book b5=new Book(42, "Angular", "Amit");
		Book b6=new Book(5, "Spring", "Surya");
		BookCollection bookList = new BookCollection();
		bookList.books.add(b1);
		bookList.books.add(b2);
		bookList.books.add(b3);
		bookList.books.add(b4);
		bookList.books.add(b5);
		bookList.books.add(b6);
		System.out.println("\n....displaying all the books......");
		bookList.display();
		System.out.println("\n....check the book is available or not ......");
		bookList.hasBook(new Book(1, "Core Java", "navyy"));
		System.out.println("\n....sorted by author name ......");
		bookList.SortByBookAuthor();
		System.out.println("\n....sorted by author book name ......");
		bookList.SortByBookName();
		
		
		
	}

}
