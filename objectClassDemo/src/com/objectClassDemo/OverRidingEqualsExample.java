package com.objectClassDemo;


class Emp{
	private int id;
	private String name;
	private double salary;

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

	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Emp() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)// and this can not be null otherwise we must have NPEx
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Emp temp = (Emp) obj;
		if (this.getId() != temp.getId())
			return false;
		if (this.name == null) {
			if (temp.name != null)
				return false;
		} else if (!this.name.equals(temp.name)) {
			return false;
		}
		// if(this.salary!=temp.salary): this is a bad code!
		// either use bigdecimal class: is more accurate in calculations
		// with double : precison!
		if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(temp.salary))
			return false;
		return true;
	}
	

	@Override
	public int hashCode() {
		
		return (int) ((2*salary)+id);
	}
	
	}

public class OverRidingEqualsExample {

	public static void main(String[] args) {
		
		
		Emp emp1 = new Emp(121, "Mahesh", 3000);
		Emp emp2 = new Emp(121, "Mahesh", 3000);
		if (emp1.equals(emp2))
			System.out.println("These are equal");
		else
			System.out.println("There are not euqal");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
	}
	}

