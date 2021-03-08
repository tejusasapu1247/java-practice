package com.day2.Inheritance;

public class Box2D {
	
	private int l;
	private int b;
	public Box2D(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	public void print() {
		System.out.println("length = "+ l);
		System.out.println("bredth = "+b);
	}
}
class Box3D extends Box2D{
	
	private int h;
	public Box3D(int l, int b,int h) {
		super(l,b);
		this.h = h;
	}
	public void print() {
		super.print();
		System.out.println("height = "+ h);
	}
}
class Box3DWithColor extends Box3D{
	
	private String color;
	public Box3DWithColor(int l, int b,int h,String color) {
		super(l,b,h);
		this.color = color;
	}
	public void print() {
		super.print();
		System.out.println("color = "+ color);
	}
}

class Demo{
	public static void main(String ar[]) {
		Box3DWithColor b=new Box3DWithColor(12, 13, 20, "green");
		b.print();
	}
}