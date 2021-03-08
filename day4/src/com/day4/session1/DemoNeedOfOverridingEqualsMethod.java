package com.day4.session1;

class Emp {
	private int id;
	private String name;
	private double salary;

	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}

public class DemoNeedOfOverridingEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp(121, "teju", 2000);
		Emp emp2 = new Emp(121, "teju", 2000);
		if (emp1.equals(emp2)) {
			System.out.println("they are same");
		} else {
			System.out.println("they are not same");
		}
	}

}
