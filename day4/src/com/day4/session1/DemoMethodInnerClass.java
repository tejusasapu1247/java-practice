package com.day4.session1;

class A {
	public void foof() {
		// method local inner class can use local variables of that method where it is
		// defined
		// but there is a comdition, that it should be "final"
		// java 1.7,1.8
		int i = 90;//effectively final i.e,java assuming that it is a final
		class B {
			public void someSecretLogic() {
				System.out.println("some key logic that should not be expose to the world..expose.");
			}
		}
		B b = new B();
		b.someSecretLogic();
	}

	public void foof2() {

	}
}

public class DemoMethodInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.foof();
	}

}
