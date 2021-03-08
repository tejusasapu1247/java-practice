package com.model;

import java.util.List;

public interface CustomerDao {
	public void addCustomer(Customer customer);
	public void delCustomer(int id);
	public void udateCustomer(int id,Customer customer);
	public Customer getCustomerById(int id);
	public List<Customer> getAllCustomers();
	
}
