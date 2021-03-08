package com.Lab3Assignment.q1;

public class CommisionEmployee extends Employee{
	private int percentage;
	private int weeklySale;
	
	public CommisionEmployee(int rate,int percentage, int weeklySale) {
		super(rate);
		this.percentage = percentage;
		this.weeklySale = weeklySale;
		
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (percentage*weeklySale)/100;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return (percentage*weeklySale)/100;
		
	}

	@Override
	public int increaseRate() {
		// TODO Auto-generated method stub
		return 5;
	
	}
	
}
