package com.day10.session2;

class Emp {
	private int id;
	private String name;
	private double salary;
	private String dept;
	private String Lastname;
	public Emp() {
	}

	public Emp(int id, String name, double salary, String lastname,String dept ) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.Lastname = lastname;
		this.dept = dept;
		
	}



	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", Lastname=" + Lastname
				+ "]";
	}

	
}

