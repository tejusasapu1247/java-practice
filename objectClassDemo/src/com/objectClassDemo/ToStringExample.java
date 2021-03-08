package com.objectClassDemo;

class Student{
	private String name;
	private int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}
public class ToStringExample {

	public static void main(String[] args) {
		 Student s=new Student("Ram", 121);
	        System.out.println(s);
	        System.out.println(s.toString());
	        
	}
	

}
