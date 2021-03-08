package com.day3.session1.mcq;

class Animal{
	public void sound() {
		System.out.println("don'y know how it sounds....");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("bhoo bhooo...");
	}

}
class Cat extends Animal{
	public void sound() {
		System.out.println("meou meou....");
	}

}

public class UsecaseOfInstanceOf {
public static void main(String args[]) {
	Animal [] animals= {new Cat(),new Dog(),new Dog(),new Cat()};
	for(Animal animal:animals) {
		animal.sound();
	
}
}
}

