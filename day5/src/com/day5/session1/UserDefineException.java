package com.day5.session1;

import static java.lang.Math.*;

@SuppressWarnings("serial")
class NegativeRadiusException extends Exception {
	public NegativeRadiusException(String s) {
		super(s);
	}
}

class Circle {
	private int radius;
	public Circle(int radius) throws NegativeRadiusException {
		if (radius < 0)
			throw new NegativeRadiusException("radius= " + radius + " is not possible");
		this.radius = radius;
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Circle c = new Circle(-3);
			System.out.println(c.getArea());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
