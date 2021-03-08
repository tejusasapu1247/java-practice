package StaffExample;

public class TeachingStaff extends Person {

	private String teachingSubject;
	private String Qualification;
	private double teachinRating;
	private boolean phd;

	public TeachingStaff(String name, String address, String teachingSubject, String qualification,
			double teachinRating, boolean phd) {
		super(name, address);
		this.teachingSubject = teachingSubject;
		Qualification = qualification;
		this.teachinRating = teachinRating;
		this.phd = phd;
	}

	public String getTeachingSubject() {
		return teachingSubject;
	}

	public String getQualification() {
		return Qualification;
	}

	public double getTeachinRating() {
		return teachinRating;
	}

	public void getDetails() {
		// TODO Auto-generated method stu
		System.out.println("Teacher details are:" + "\nname             :" + name + "\naddress          :" + address
				+ "\nteachingSubject  :" + teachingSubject + "\nQualification    :" + Qualification
				+ "\nteacherRating    :" + teachinRating + "\nphd              :" + phd);
	}

}
