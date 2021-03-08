package com.day3.session1.mcq;

class Foof{
	static void foof() {
		System.out.println("static void foof() of Foof");
	}
}
class Foof2 extends Foof{
	static void foof() {
		System.out.println("static void foof() of Foof2");
	}
}
public class Demo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foof2 f =new Foof2();
		f.foof();
	}

}
