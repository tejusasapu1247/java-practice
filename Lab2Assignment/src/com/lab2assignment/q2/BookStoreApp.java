package com.lab2assignment.q2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		int ch;
		BookStore bs = new BookStore();
		bs.books.add(new Book("c", "SDWEF", "12werwq", 34));
		bs.books.add(new Book("c++", "SFDGR", "1rwe2ss3", 12));
		bs.books.add(new Book("Java", "FRSD", "3442er3", 25));
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(" Enter “1”, to display the Books: Title – Author – ISBN - Quantity.");
			System.out.println(" Enter “2”, to order new books.");
			System.out.println(" Enter “3”, to sell the books");
			System.out.println(" Enter “0”, to exit the system.");
			ch = sc.nextInt();
			if (ch == 1)
				bs.displayBooks();
			else if (ch == 2) {
				System.out.println("Enter the ISBN number: ");
				String isbn = sc.next();
				int numOfCopies;
				System.out.println("Enter the number of copies: ");
				numOfCopies = sc.nextInt();
				bs.order(isbn, numOfCopies);
			} else if (ch == 3) {
				System.out.println("Enter book name: ");
				String title = sc.next();
				int numOfCopies;
				System.out.println("Enter the number of copies: ");
				numOfCopies = sc.nextInt();
				bs.sell(title, numOfCopies);
			} else if (ch == 0) {
				System.out.println("Thank you!!!");
			} else {
				System.out.println("Entered the Wrong option!!!!");
			}
		} while (ch != 0);

	}
}
