package com.day10.session1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp {
	private int id;
	private String name;
	private double salary;
	private String dept;

	public Emp() {
	}

	public Emp(int id, String name, double salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
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
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

}

public class MoreExampleOnLE {

	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(
				new Emp(121, "teju", 71234, "IT"), 
				new Emp(12, "amit", 23454, "SDFT"),
				new Emp(11, "usha", 12345, "mkt"));
				Comparator<Emp> comparator=(Emp o1,Emp o2)->{
					return Double.compare(o2.getSalary(), o1.getSalary());
				};
				Comparator<Emp> comparator2 = (Emp o1, Emp o2) -> 
				 Double.compare(o2.getSalary(), o1.getSalary());

			Comparator<Emp> comparator3 = ( o1,  o2) -> Double.compare(o1.getSalary(), o2.getSalary());
			Collections.sort(list, comparator3);
			
			System.out.println("sorted as per salary...");
			for(Emp e:list) {
				System.out.println(e);
			}
			Comparator<Emp> c4=(o1,o2)-> o1.getName().compareTo(o2.getName());
			Collections.sort(list, c4);
			System.out.println("sorted as per name......");
				
			for(Emp e:list) {
					System.out.println(e);
				}
	}
}
