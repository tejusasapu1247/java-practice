package com.day8.session1;

import java.io.Serializable;

public class Emp implements Serializable {
	
	private int id;
	private String name;
	private double salary;
	static String companyname="HCL";
	private transient String temppwd;
	public Emp() {

	}

	public Emp(int id, String name, double salary) {
		System.out.println("ctr is called....");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static String getCompanyname() {
		return companyname;
	}

	public static void setCompanyname(String companyname) {
		Emp.companyname = companyname;
	}

	public String getTemppwd() {
		return temppwd;
	}
	public void setTemppwd() {
		this.temppwd = temppwd;
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

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", temppwd=" + temppwd + "]";
	}

}
