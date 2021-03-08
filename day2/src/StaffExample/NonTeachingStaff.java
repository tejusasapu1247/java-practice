package StaffExample;

public class NonTeachingStaff extends Person {
	private String skill;

	public NonTeachingStaff(String name, String address, String skill) {
		super(name, address);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Non Teaching staff details are:" + "\nname                        :" + name
				+ "\naddress                     :" + address + "\nteaching Skill              :" + skill);
	}

}
