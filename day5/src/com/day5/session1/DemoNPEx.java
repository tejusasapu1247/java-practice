package com.day5.session1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoNPEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b=0, c=0;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		a=sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		c=a/b;
		System.out.println(c);
		System.out.println("hello");
	}
		catch (ArithmeticException e) {
			System.out.println("don't divide with zero");
		}
		catch (InputMismatchException e) {
			System.out.println("don't divide with alphabets");
			e.printStackTrace();// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("something has happened..."+e.getMessage());
			
		}
		System.out.println("Done!");

}
}