package com.lab2assignment.q1;

public class Circle {
	private double radius;
	private String color;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea(double r) {
		return Math.PI * r * r;
	}

	public void printResults() {
		System.out.println("circle radius = " + radius + "\nArea of circle = " + getArea(radius));
	}

}
