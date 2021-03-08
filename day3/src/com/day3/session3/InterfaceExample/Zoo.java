package com.day3.session3.InterfaceExample;


class Bird{
	public void sound() {
		System.out.println("some sound of birds ...");
	}

	public void eat() {
		System.out.println("eat rice,wheat and fruits...");
	}
	public void fly() {
		System.out.println("flyyying...");
	}
}
class Emu extends Bird{
	public void eat() {
		System.out.println("eat small insects and very slow to eat!!!..");
	}
}
class Duck extends Bird implements Swimmable{

	public void eat() {
		System.out.println("I am A duck and I can eat well.");
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("I can swimm veryy well.....");
	}
	
}
class Eagle extends Bird implements Flyable{
	
}

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle eagle=new Eagle();
	}

}
