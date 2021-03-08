package com.bookstore.dao;

	public class Book {
	    private int id;
	    private String title;
	    private double price;
	    private double discount;
	    private String author;
	    private String category;
		public Book(int id, String title, double price, double discount, String author, String category) {
			super();
			this.id = id;
			this.title = title;
			this.price = price;
			this.discount = discount;
			this.author = author;
			this.category = category;
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
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", price=" + price + ", discount=" + discount + ", author="
					+ author + ", category=" + category + "]";
		}
	    
}
