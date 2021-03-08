package com.lab2assignment.q4;

public class Student {
	private String name;
	private String id;
	private double grade;

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, String id) {
		this(name);
		this.id = id;
	}

	public Student(String name, String id, double grade) {
		this(name, id);
		this.grade = grade;
	}

	public void display(int year) {
		System.out.println("year :" + year);
		display();
	}

	public void display() {
		System.out.println("name :" + name + "\nid :" + id + "\ngrade :" + grade);
	}

}
