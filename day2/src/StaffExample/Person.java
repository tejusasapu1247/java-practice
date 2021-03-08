package StaffExample;

public class Person {
	protected String name;
	protected String address;

	public Person(String name, String address) {
		this.address = address;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
}
