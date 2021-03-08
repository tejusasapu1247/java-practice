package example;

public class Employee {
	private String name;
	private String role;
	private String dept;
	private double salary;
	private BenifitsHelper helper = new BenifitsHelper();
	public Employee(String name, String role, String dept, double salary) {
		super();
		this.name = name;
		this.role = role;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getWithHolding() {
		return helper.calcWithHoldingRate(salary);
	}
	public double getBouns() {
		return helper.calcBonus(salary);
	}
	private class BenifitsHelper {
		private final double bonusRate = 0.02;
		private final double withHoldingRate = 0.07;

		protected double calcBonus(double salary) {
			return salary * bonusRate;
		}

		protected double calcWithHoldingRate(double salary) {
			return salary * withHoldingRate;
		}
	}

}
                