package com.lab2assignment.q2;

import java.util.ArrayList;
import java.util.Scanner;

import com.lab2assignment.q2.Book;;

public class BookStore {
	Scanner sc = new Scanner(System.in);
	int flag = 0;
	ArrayList<Book> books = new ArrayList<Book>();
	int count = books.size();

	public void sell(String bookTitle, int noOfCopies) {
		for (Book b : books) {
			System.out.println(b.bookTitle);
			if (bookTitle.contentEquals(b.bookTitle)) {
				b.numOfcopies -= noOfCopies;
				System.out.println("your book is sold successfully...check the number of copies Now..");
				break;
			}
		}
		System.out.print("sorry this book is not availabe...");
	}

	public void order(String isbn, int noOfCopies) {
		for (Book b : books) {
			if (isbn.contentEquals(b.ISBN)) {
				flag = 1;
				b.numOfcopies += noOfCopies;
				System.out.println("your book is added successfully...");
				break;
			}
		}
		if (count > 10) {
			System.out.println("Sorry...We cannot add futher books..thelimti is 10 only");
		}
		if (flag == 0) {
			String title, Author;
			System.out.print("Enter the book title: ");
			title = sc.next();
			System.out.print("Enter the book Author: ");
			Author = sc.next();
			books.add(new Book(title, Author, isbn, noOfCopies));
			System.out.println("your book is added successfully...");
			count++;
		}
	}

	public void displayBooks() {
		// TODO Auto-generated method stub
		for (Book d : books) {
			d.display();
		}
	}
}