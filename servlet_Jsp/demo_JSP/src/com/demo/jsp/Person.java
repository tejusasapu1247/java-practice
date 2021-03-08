package com.demo.jsp;

public class Person {
	private Dog dog;
	private String pName;
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public String getName() {
		return pName;
	}
	public void setName(String name) {
		this.pName = name;
	}
	public Person() {}
}
