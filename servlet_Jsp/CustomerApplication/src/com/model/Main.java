package com.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		CustomerDao dao=new CustomerDaoImpl();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("...adding customer.....");
		try {
			Date dob=formatter.parse("01/01/2019");
			Customer customer=new Customer("joshi", "bangalore", "joshi@gmail.com", "789654332", dob, 123000000);
			dao.addCustomer(customer);
			System.out.println("..........................");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("...getting by id.....");
		 Customer customer=dao.getCustomerById(3);
		 System.out.println(customer);
		 
		 System.out.println("...getting all customers......"); 
//		List<Customer> customers=dao.getAllCustomers();
//		customers.forEach(System.out::println);
		
		
		
		
		
		
	}

}
