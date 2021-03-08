package com.day4.session2;

import java.util.Date;

class Foo{
	private int i;

	public Foo(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Foo [i=" + i + "]";
	}
	
}

class MyImmutableClasss{
	private final int temp;
	private final String name;
	private final int  []data;
	private final Date date;
	private final Foo foo;
	public MyImmutableClasss(int temp, String name, int[] data, Date date, Foo foo) {
		this.temp = temp;
		this.name = name;
		this.data = data;
		this.date = date;
		
	}
	
}



public class DemoImmutability {
	//steps to create our own immutable objects:
	// 1.class should final
	//2.allinstance variable/static variable should be final and assigned in ctr
	//3.dont returnth eobj as it is, return the copy of the obj 
	//4.use clonning for immutable 
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
