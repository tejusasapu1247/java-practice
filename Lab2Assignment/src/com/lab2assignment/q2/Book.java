package com.lab2assignment.q2;

public class Book {
	String bookTitle;
	String author;
	String ISBN;
	int numOfcopies;

	public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.author = author;
		this.bookTitle = bookTitle;
		this.ISBN = ISBN;
		this.numOfcopies = numOfCopies;
	}

	public void display() {
		System.out.println(bookTitle + "-" + author + "-" + ISBN + "-" + numOfcopies);
	}
}
