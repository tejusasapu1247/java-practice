package com.day4.session1;

enum ShirtSize {
	S(12), M(23), L(34), XL(43);// objects of enum
	private int size;
	private ShirtSize() {
		System.out.println("ctr is called...");
	}
	private ShirtSize(int size) {
		this.size=size;
	}

}

class Shirt {

	private String brand;
	private String color;
	private ShirtSize size;
	private double price;

	public Shirt(String brand, String color, ShirtSize size, double price) {
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ShirtSize getSize() {
		return size;
	}

	public void setSize(ShirtSize size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", color=" + color + ", size=" + size + ", price=" + price + "]";
	}

}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShirtSize[] shirtsize=ShirtSize.values();
		for(ShirtSize size:shirtsize) {
			System.out.println(size.name());
		}

	}

}
