package com.JdbcCustomerApplication.Controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.JdbcCustomerApplication.Dao.CustomerDao;
import com.JdbcCustomerApplication.Dao.CustomerDaoImplementation;
import com.JdbcCustomerApplication.Exception.DaoException;
import com.JdbcCustomerApplication.Model.Customer;

public class CustomerController {

	public static void main(String[] args) {
		CustomerDao customerDao=null;
		
//		adding customer into databse
	
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("d/MM/yyy");
		String dateString="10/10/2003";
		LocalDate utilDate=LocalDate.parse(dateString,formatter);
		Date birthDate = Date.valueOf(utilDate);
		try {
			customerDao=new CustomerDaoImplementation();
			customerDao.addCustomer(new Customer(3, "rahul", 1232767892, "rahul@gmail.com",birthDate, "Delhi", 20));
		} catch (DaoException e) {
			e.printStackTrace();
		}
		
		//printing all the customers from the database
		try {
			customerDao=new CustomerDaoImplementation();
			List<Customer> allCustomers= customerDao.getAllCustomers();
			allCustomers.forEach(System.out::println);
			} catch (DaoException e) {
			e.printStackTrace();
		}

		//deleting the record based on id from customer database
		try {
			customerDao=new CustomerDaoImplementation();
			customerDao.deleteCustomer(2);
		}catch (DaoException e) {
			e.printStackTrace();
			
		}
		
		// updating customer by their purchaseCapacity
		try {
		customerDao=new CustomerDaoImplementation();
			customerDao.updateCustomer(2, 2100);
		}catch (DaoException e) {
			e.printStackTrace();
			
		}
		
		
		//printing customer details specified by customer purchaseCapacity
		try {
			customerDao=new CustomerDaoImplementation();
			List<Customer> customersByPurchaseCapacity= customerDao.getSelectedCustomer(245);
			System.out.println("\n printing customer details specified by customer purchaseCapacity");
			customersByPurchaseCapacity.forEach(System.out::println);
			} catch (DaoException e) {
			e.printStackTrace();
		}
		
		//printing customer details specified by customer purchaseCapacity
		try {
			customerDao=new CustomerDaoImplementation();
			Customer customersById= customerDao.getCustomerById(2);
			customersById.printDetails();
			} catch (DaoException e) {
			e.printStackTrace();
		}

}
}
