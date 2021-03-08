package com.day3.session1.mcq;

class A {
	void foof() {
	System.out.println("foo of A");
}
}
class B extends A {
	void foof() {
	System.out.println("foo of B");
}
}
class C extends A {
	void foof() {
	System.out.println("foo of C");
}
}
class Demo1{
	public static void main(String args[]) {
		A a=new A();
		//If a 
		if(a instanceof A) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}

