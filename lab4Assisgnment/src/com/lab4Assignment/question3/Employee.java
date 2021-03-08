package com.lab4Assignment.question3;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	private String name;
	private String address;
	private transient double salary;
	
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("name = "+getName()+",id = "+getId()+"adddress = "+getAddress()+",salary = "+getSalary());
	}
	

}