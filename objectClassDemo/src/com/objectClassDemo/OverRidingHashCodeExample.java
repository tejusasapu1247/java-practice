package com.objectClassDemo;


class Employee{
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

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)// and this can not be null otherwise we must have NPEx
//			return false;
//		if (this.getClass() != obj.getClass())
//			return false;
//		Employee temp = (Employee) obj;
//		if (this.getId() != temp.getId())
//			return false;
//		if (this.name == null) {
//			if (temp.name != null)
//				return false;
//		} else if (!this.name.equals(temp.name)) {
//			return false;
//		}
//		// if(this.salary!=temp.salary): this is a bad code!
//		// either use bigdecimal class: is more accurate in calculations
//		// with double : precison!
//		if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(temp.salary))
//			return false;
//		return true;
//	}
//	
	@Override
	public int hashCode() {		
		return name.length();
	}

	}
	
public class OverRidingHashCodeExample {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(121, "MOkSHA", 2000);
		Employee emp2 = new Employee(121, "MOKSHA", 2000);
		if (emp1.equals(emp2))
			System.out.println("objects are equal");
		else
			System.out.println("objects are not equal");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
	}
	}

