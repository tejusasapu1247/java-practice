package com.day6.session1.needOfcomparable;

import java.util.Comparator;

class BookSorterAsPerPrice implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPrice(),o2.getPrice());
	}
}
class BookSorterAsPerTitle implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle());
	}
}

class BookSorterAsPerPriceAndAsPerNoOfPages implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		int val=Double.compare(o1.getPrice(), o2.getPrice());
		if(val==0) {
			val=Double.compare(o1.getnOspages(), o2.getnOspages());
		}
		return val;
	}
}
public class Book implements Comparable<Book>{
	private int id;
	private String title;
	private double price;
	private int nOspages;
	public Book() {}
	public Book(int id, String title, double price, int nOspages) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.nOspages = nOspages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getnOspages() {
		return nOspages;
	}
	public void setnOspages(int nOspages) {
		this.nOspages = nOspages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", nOspages=" + nOspages + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.getId(),o.getId());
	}

}