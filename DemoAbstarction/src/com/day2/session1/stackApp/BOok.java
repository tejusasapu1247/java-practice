package com.day2.session1.stackApp;

public class BOok {
	public BOok(int id, String bookname) {
		this.id = id;
		this.bookname = bookname;
	}
	private int id;
	private String bookname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void printDetails() {
		System.out.println("the book name: "+bookname + ",book id ="+id);;
	}
	
}
