package com.day2.session1.stackApp;

public class BookStackTester {
	public static void main(String args[]) {
		BookStack bookstack = new BookStack();
		bookstack.push(new BOok(1,"ANgular"));
		bookstack.push(new BOok(2,"C#"));
		bookstack.push(new BOok(3,"Java"));
		bookstack.push(new BOok(4,"Python"));
		bookstack.push(new BOok(5,"C++"));
		BOok b1=bookstack.pop();
		b1.printDetails();
		
		
		
		
	}
}
