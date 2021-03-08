package StaffExample;

public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("moksha", "ooty", "schooling", 2020, 1000);
		TeachingStaff teacher = new TeachingStaff("Jagadeesh", "Srikakulam", "C programming", "M.Tech", 10, true);
		NonTeachingStaff n = new NonTeachingStaff("Srujana", "palasa", "c++");
		stu.getDetails();
		System.out.println();
		teacher.getDetails();
		System.out.println();
		n.getDetails();

	}

}
