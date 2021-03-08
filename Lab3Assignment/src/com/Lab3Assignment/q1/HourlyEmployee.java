package com.Lab3Assignment.q1;

public class HourlyEmployee extends Employee{
	private int workingHours;
	private int salary;
	
	
	

	public HourlyEmployee(int rate,int workingHours, int salary) {
		super(rate);
		this.workingHours = workingHours;
		this.salary = salary;
	}


	public int getWorkingHours() {
		return workingHours;
	}


	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return salary*workingHours;
	}


	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return salary*workingHours;
	}


	@Override
	public int increaseRate() {
		return 7;
	}

}
