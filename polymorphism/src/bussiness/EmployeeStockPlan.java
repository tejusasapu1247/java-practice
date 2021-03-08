package bussiness;

import polymorphism.Director;
import polymorphism.Employee;
import polymorphism.Manager;

public class EmployeeStockPlan {
	private int empShares = 10;
	private int managerShares = 100;
	private int directorShares = 1000;
public int grantStock(Employee e) {
	if(e instanceof Director) {
		return directorShares;
	} else {
		if (e instanceof Manager) {
			return managerShares;	
		} else{
			return empShares;
		}
	}
}
	
}
