package com.lab4Assisgnment.question6;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputException extends Exception{

	public InputException(String message) {
		super(message);
		}
	
	
}
public class Question6OwnException {

	public static void main(String[] args){
		int n = 0;
		do {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();				
				if(n>100) {
					throw new InputException("Number can’t be greater than 100");
				}
				if(n%2==0) 
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			}catch (InputException e) {
				System.out.println(e.getMessage());
		}
		}while(n!=-1);
	
	}

}
