package com.day3.session1;

class Calculator{
	public static long add(int a,long b) {
		return a+b;
	}
//	public int add(int a,int b,int c) {
//		return a+b+c;
//	}
	public int add(int ...a) {
		//a is an array and this method is a variable argument method...
		int sum=0;
		for(int var:a) {
			sum+=var;
		}
		return sum;
		
	}
	
}

public class DemoFunctionOverloading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		long sum= Calculator.add(10, 10);
		int additionVal = cal.add(12,13,14,15);
		System.out.println("sum from static method = "+sum);
		System.out.println("sum from variable argument method = "+additionVal);
	}

}
