package com.lab4Assignment.question5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question5 {
	public static void main(String [] args) {
		
		int n = 0;
		do {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
				if(n>100 ){
					throw new Exception("Number can’t be greater than 100");
				}				
				if(n%2==0) 
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			}catch (InputMismatchException e) {
				System.out.println("You must enter an integer.");
		}
			catch (Exception e) {
					System.out.println(e.getMessage());
			}
			
		}while(n!=-1);
	
	}
}


