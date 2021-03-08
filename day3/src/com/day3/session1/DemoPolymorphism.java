package com.day3.session1;

import java.util.Scanner;

abstract class Shape{
	public Shape() {
}
//	public void printArea() {
//		System.out.println("I don't know the shape..");
//	}
	public abstract void printArea();
	}

class Circle extends Shape{
	public void printArea() {
		System.out.println("Area: PI*r*r");
	}
}
class Triangle extends Shape{
	public void printArea() {
		System.out.println("Area: 1/2 *b*h");
	}
}
class Rectangle extends Shape{
	public void printArea() {
		System.out.println("Area: b*h");
	}
}

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape =null;
		Scanner sc=new Scanner(System.in);
		System.out.println("plzz enter the shape...1 traingle 2.cicrle 3.Rectangle");
		int ch=sc.nextInt();
		if(ch==1) {
			shape= new Triangle();
		}else if(ch==2) {
			shape=new Circle();
		}else if(ch==3) {
			shape = new Rectangle();
		}
		shape.printArea();
}
}
