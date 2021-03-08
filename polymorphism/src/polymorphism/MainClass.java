package polymorphism;

import bussiness.EmployeeStockPlan;

public class MainClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Employee e=new Employee(10, "moksha", 1000000);
	Manager m=new Manager(11, "teju", 200000, "IT");
	EmployeeStockPlan esp = new EmployeeStockPlan();
	Employee e1= new Director(13, "ram", 300000, 40);
	if(e1 instanceof Manager) {
		Manager m1= (Manager) e1;
		//m1.setDeptName("HR");
		System.out.print(m1.toString());
	} else {
		System.out.println("this is not a manager object and this is an object of   "+ e1.getClass().getSimpleName());
		Director m1= (Director) e1;
		//m1.setDeptName("HR");
		System.out.println(m1.toString());
	}
	System.out.println(e.getClass().getSimpleName() + " will get " + esp.grantStock(e));
	System.out.println(m.getClass().getSimpleName() + " will get " + esp.grantStock(m));
	System.out.println(e1.getClass().getSimpleName() + " will get " + esp.grantStock(e1));

	}
}
