package com.day2.q2;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	public Employee(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void printDetails() {
		System.out.println("EMployee deatails:" + id +","+firstName+","+lastName+","+salary);
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getSalary() {
		return salary;
	}
	public double getRaiseSalary(int percentage) {
		if(!(percentage<0 || percentage>50))
				salary= salary;
		else  salary =salary+salary*percentage/100;
		
		return salary;
		
	}
	
}
