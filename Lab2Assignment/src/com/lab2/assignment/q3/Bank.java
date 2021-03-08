package com.lab2.assignment.q3;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int ch, initialAmmount;
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		System.out.println("enter the username :");
		String userName = sc.nextLine();
		System.out.println("Enter the initial amount for your account :");
		initialAmmount = sc.nextInt();
		System.out.println("choose the type of account you want to open \n 1.SavingsAccount   2.CurrentAccount :");
		ch = sc.nextInt();
		if (ch == 1) {
			acc = new SavingsAccount(userName, initialAmmount);
			System.out.println("Your Savings account has been created with the A/C number :" + acc.getAccountNumber()
					+ " ,your balance =" + initialAmmount + "/-");

			do {
				System.out.println(
						"choose the options below \n 1.deposit    2.withdraw    3.check balance   0.exit from the system");
				ch = sc.nextInt();
				if (ch == 1) {
					System.out.println("do you want to check the balance? yes/no:");
					String response = sc.next();
					if (response.contains("yes")) {
						System.out.println("your balance=" + acc.getBalance());
					} else if (response.contains("no")) {
						System.out.println("Enter the amount you want to deposit:");
						int amount = sc.nextInt();
						acc.deposit(amount);
						System.out.println("your balance=" + acc.getBalance());
					}
				} else if (ch == 2) {
					System.out.println("do you want to check the balance? yes/no:");
					String response = sc.next();
					if (response.contains("yes")) {
						System.out.println("your balance=" + acc.getBalance());
					} else if (response.contains("no")) {
						System.out.println("Enter the amount you want to withdraw:");
						int amount = sc.nextInt();
						acc.withdraw(amount);
						System.out.println("your balance=" + acc.getBalance());
					}
				} else if (ch == 3) {
					System.out.println("your balance=" + acc.getBalance());
				} else if (ch == 0)
					System.out.println("thank you!!!");
			} while (ch != 0);

		}
		if (ch == 2) {
			acc = new CurrentAccount(userName, initialAmmount);
			System.out.println("Your CurrentAccount has been created with the A/C number :" + acc.getAccountNumber()
					+ " ,your balance =" + initialAmmount + "/-");

			do {
				System.out.println(
						"choose the options below \n 1.deposit    2.withdraw    3.check balance   0.exit from the system");
				ch = sc.nextInt();
				if (ch == 1) {
					System.out.println("do you want to check the balance? yes/no:");
					String response = sc.next();
					if (response.contains("yes")) {
						System.out.println("your balance=" + acc.getBalance());
					} else if (response.contains("no")) {
						System.out.println("Enter the amount you want to deposit:");
						int amount = sc.nextInt();
						acc.deposit(amount);
					}
				} else if (ch == 2) {
					System.out.println("do you want to check the balance? yes/no:");
					String response = sc.next();
					if (response.contains("yes")) {
						System.out.println("your balance=" + acc.getBalance());
					} else if (response.contains("no")) {
						System.out.println("Enter the amount you want to withdraw:");
						int amount = sc.nextInt();
						acc.withdraw(amount);
						System.out.println("your balance=" + acc.getBalance());
					}
				} else if (ch == 3) {
					System.out.println("your balance=" + acc.getBalance());
				} else if (ch == 0)
					System.out.println("thank you!!!");
			} while (ch != 0);

		}
	}
}