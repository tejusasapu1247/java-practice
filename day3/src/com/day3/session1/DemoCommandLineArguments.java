package com.day3.session1;

public class DemoCommandLineArguments {
	public static void main(String[] args) {
	int sum=0;
	for(String temp:args) {
		sum=sum+Integer.parseInt(temp);
		System.out.println(temp);
	}
	System.out.println("sum = "+sum);
	}
}
