package com.Lab3Assignment.q1;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
public class EmployeeRecordSystem {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		Employee Semp=new SalariedEmployee(2,20000);
		Semp.setRate(Semp.increaseRate());
		Employee Cemp=new CommisionEmployee(3,200,20000);
		Semp.setRate(Cemp.increaseRate());
		Employee Hemp=new HourlyEmployee(4, 5,20000);
		Semp.setRate(Hemp.increaseRate());
		System.out.println("choose the below options:\n"
				+ "\n1.Employee weekly salary details \n2.To set rate Employee");
		
		do{
			choice=scanner.nextInt();
			if(choice ==1) {
				System.out.println("the Salarised Employee details are :"+Semp.getSalary());
				System.out.println("the commisioned Employee details are :"+Cemp.getSalary());
				System.out.println("the Hourly Employee details are :"+Hemp.getSalary());				
			}else if(choice==2) {
					System.out.println("the Salarised Employee rate is :"+Semp.getRate());
					System.out.println("the commisioned Employee  rate is:"+Cemp.getRate());
					System.out.println("the Hourly Employee  rate is :"+Hemp.getRate());				
				}
		}while(choice!=0);
	}

}
