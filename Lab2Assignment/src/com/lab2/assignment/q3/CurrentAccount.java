package com.lab2.assignment.q3;

public class CurrentAccount extends Account {
	private int tradeLicenseNumber;

	public CurrentAccount(String memberName, int accBalance) {
		super(memberName, accBalance);

	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (amount < accBalance) {
			accBalance = accBalance - amount;
		}
	}

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return accBalance;
	}

}
