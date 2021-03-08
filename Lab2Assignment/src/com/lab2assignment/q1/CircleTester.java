package com.lab2assignment.q1;

public class CircleTester {

	public static void main(String[] args) {
		Circle circle = new Circle(3.4);
		double r = circle.getRadius();
		circle.getArea(r);
		circle.printResults();
	}

}
