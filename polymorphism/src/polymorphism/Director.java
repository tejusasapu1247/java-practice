
package polymorphism;

public class Director extends Employee{
	private int Experience;
	public Director(int empId, String empName, double salary, int experience) {
		super(empId, empName, salary);
		this.Experience = experience;
		// TODO Auto-generated constructor stub
	}
	public void setExperience(int  exp) {
		this.Experience = exp;
		
	}
	public String toString() {
	return super.toString() + "\n" + " Emp experience = " + Experience;
	}

}

