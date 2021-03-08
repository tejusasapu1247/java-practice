package com.Lab3Assignment.q1;

public class SalariedEmployee extends Employee {
	private int salary;
	
	public SalariedEmployee(int rate, int salary) {
		super(rate);
		this.salary = salary;
	}
	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return salary;
	}
	@Override
	public int increaseRate() {
		return 3;
	}

}
