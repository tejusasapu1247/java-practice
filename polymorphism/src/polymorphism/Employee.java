package polymorphism;

public class Employee {
	protected int empId;
	protected String empName;
	protected double salary;
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public String toString() {
		return " EmpID:     " + empId + "\n" +
			   " EmpNAme:   " + empName + "\n" +
			   " Emp salary:" + salary;	
	}
}
