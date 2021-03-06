package com.objectClassDemo;

class Teacher implements Cloneable {
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

	public Teacher(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public Teacher() {
	}

	
		@Override
	public int hashCode() {
		return name.length();
	}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)// and this can not be null otherwise we must have NPEx
				return false;
			if (this.getClass() != obj.getClass())
				return false;
			Teacher temp = (Teacher) obj;
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
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

		@Override
		public String toString() {
			return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
}

public class cloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Teacher emp1 = new Teacher(121, "RAJA", 3000);
		Teacher emp2=(Teacher) emp1.clone();
		if (emp1.equals(emp2))
			System.out.println("are eq");
		else
			System.out.println("are not eq");
		System.out.println(emp1);
		System.out.println(emp2);
		emp1.setId(2);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.getId());
		System.out.println(emp2.getId());
		if (emp1.equals(emp2))
			System.out.println("are eq");
		else
			System.out.println("are not eq");
	}

}

