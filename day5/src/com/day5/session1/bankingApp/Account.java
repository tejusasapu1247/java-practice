package com.day5.session1.bankingApp;

public class Account {
	private int id;
	private String name;
	private int balance;
	private static int accountIdCounter=0;
	public Account(String name, int balance) throws AccountCreationException {
		if(balance<1000) {
			throw new AccountCreationException("youcan not create an account with "+balance+" this amount,min balance is requored is 1000");
		}
		this.id = ++accountIdCounter;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(int amount) throws NotSuficientFundException {
		int tempBal = balance - amount;
		if (tempBal < 1000) {
			throw new NotSuficientFundException("you must have min balance");
		}
		balance=tempBal;
	}
	public void deposit(int amount) throws OverFundException {
		int tempBal = balance + amount;
		if (tempBal >5000000) {
			throw new OverFundException("please meet branch manager ,u can not deposit "+amount);
		}
		balance=tempBal;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
