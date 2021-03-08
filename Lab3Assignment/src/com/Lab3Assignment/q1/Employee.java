package com.Lab3Assignment.q1;

import com.Lab3Assignment.q2.Payable;

public abstract class Employee implements  Payable{
	private int rate;

	public Employee(int rate) {
		this.rate=rate;
	}


	public abstract int getSalary();

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public abstract int increaseRate();

}
