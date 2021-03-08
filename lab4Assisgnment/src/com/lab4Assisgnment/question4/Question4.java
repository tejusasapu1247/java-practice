package com.lab4Assisgnment.question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {
	public static void main(String [] args) {
		
		int n = 0;
		do {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();				
				if(n!=(int)n) {
					throw new InputMismatchException();
				}
				if(n%2==0) 
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			}catch (InputMismatchException e) {
				System.out.println("You must enter an integer.");
		}
		}while(n!=-1);
	
	}
}

