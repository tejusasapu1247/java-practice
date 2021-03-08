package com.lab2.assignment.q3;

public class SavingsAccount extends Account {
	private int interest = 5;
	private int limit = 20000;

	public SavingsAccount(String memberName, int accBalance) {
		super(memberName, accBalance);
	}

	@Override
	public void withdraw(int amount) {
		if (amount > accBalance)
			System.out.println("you have not sufficient balance...\n");
		else if (amount <= limit && amount < accBalance) {
			accBalance = accBalance - amount;
		} else
			System.out.print("the limit to withdraw is " + limit + "only\n");
	}

	@Override
	public int getBalance() {
		return interest + accBalance;
	}
}
