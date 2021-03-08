package com.day10.session1;
interface Cal{
	public int add(int a,int b);
	public default void print() {
		System.out.println("this is the cal method..");
	}
}
public class DemolambdaExpression {

	public static void main(String[] args) {
		Cal cal=(int a, int b) ->a+b;
		System.out.println(cal.add(3, 7));
		
		//lambda expression
		Cal cal2=(int a,int b)->a+b;
		System.out.println("using lambda ecpression :"+cal2.add(2, 3));
		
		Runnable runnable1=new Runnable() {	
			@Override
			public void run() {
				System.out.println("runnable1");
			}
		};
		
		//labda expression
		Runnable runnable=()->System.out.println("runnable using lambda expressions");
		runnable.run();
		runnable1.run();
		
	}

}
