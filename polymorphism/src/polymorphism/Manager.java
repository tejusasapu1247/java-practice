package polymorphism;

public class Manager extends Employee{
	private String DeptName;
	public Manager(int empId, String empName, double salary, String DeptName) {
		super(empId, empName, salary);
		this.DeptName=DeptName;
		// TODO Auto-generated constructor stub
	}
	public void setDeptName(String name) {
		this.DeptName = name;
		
	}
	public String toString() {
	return super.toString() + "\n" + " Emp department = " + DeptName;
	}

}

