package com.day5.session1;

import java.io.IOException;

class A{
	public void foof() throws Exception {
		System.out.println("foof of A class......");
	}
}
class B extends A{
	public void foof() throws ArithmeticException{
		System.out.println("foof of B class......");
	} 
}
public class ExceptionHandlingWithOverridnig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B a = null;
try {
	a = new B();
} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
a.foof();
	}

}
