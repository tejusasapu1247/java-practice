package com.day10.session1;

interface A {
	public default void foo() {
		System.out.println("A");

	}
}

interface B {
	public default void foo() {
		System.out.println("B");

	}
}

class C implements A,B{
	@Override
	public  void foo(){
		B.super.foo();
		A.super.foo();
		System.out.println("def method of A and B is overriden");
	}
}
public class DiamondProblemWithJava8 {

	public static void main(String[] args) {
			A a=new C();
			a.foo();
	}
}




