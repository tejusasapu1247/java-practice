package com.demo;

public class Calculator {

	int add(int a, int b) {
		return a + b;

	}

	public int multiply(int a, int b) {

		return a * b;
	}

	public int divide(int a, int b) {
		if(b==0)	throw new ArithmeticException("denominator should not be zero...");
		return a/b;
	}

}
