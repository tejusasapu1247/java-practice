package StaffExample;

public class Student extends Person {

	private String program;
	private int year;
	private double fee;

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.fee = fee;
		this.program = program;
		this.year = year;

	}

	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public double getFee() {
		return fee;
	}

	public void printDetails() {
		System.out.println("hello");
	}

	public void getDetails() {
		System.out.println("the Student details :" + "\nname             : " + getName() + "\naddress          :"
				+ getAddress() + "\nprgramming       :" + getProgram() + "\npassed out year  :" + getYear()
				+ "\n Fee             :" + getFee());
	}
}
