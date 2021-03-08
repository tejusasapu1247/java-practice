package com.day5.session1.bankingApp;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Account acc = new Account("teju", 101110);
			//deposit
			acc.deposit(32330000);
			//withdraw
			acc.withdraw(550000);
		} catch (AccountCreationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (OverFundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (NotSuficientFundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
