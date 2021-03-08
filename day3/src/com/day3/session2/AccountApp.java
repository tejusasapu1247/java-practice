package com.day3.session2;

abstract class Account{
	private int accid;
	private String name;
	private double balance;
	public Account(int accid, String name, double balance) {
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accid=" + accid + ", name=" + name + ", balance=" + balance + "]";
	}

	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
