package com.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.exceptions.CustomerNotFoundException;
import com.model.exceptions.DataAccessException;
import com.mysql.jdbc.PreparedStatement;

public class CustomerDaoImpl implements CustomerDao{
	private Connection connection;
	public CustomerDaoImpl() {
		connection=ConnectionFactory.getConncetion();
	}
	@Override
	public void addCustomer(Customer customer) {
		String add_customer="insert into customer_Servlets(name,address,email,phone,dob,purchage_capacity)values(?,?,?,?,?,?)";
		try {
			PreparedStatement pst=(PreparedStatement) connection.prepareStatement(add_customer);
			pst.setString(1, customer.getName());
			pst.setString(2, customer.getAddress());
			pst.setString(3, customer.getEmail());
			pst.setString(4, customer.getPhone());
			pst.setDate(5, new Date(customer.getDob().getDate()));
			pst.setDouble(6, customer.getPurchaseCapacity());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		
				
	}

	@Override
	public void delCustomer(int id) {
		
		
	}

	@Override
	public void udateCustomer(int id, Customer customer) {
		String add_customer="update customer_Servlets set address=?,email=?,purchage_capacity=?,where id=?";
		PreparedStatement pst;
		try {
			pst=(PreparedStatement) connection.prepareStatement(add_customer);
			pst.setString(1, customer.getAddress());
			pst.setString(2, customer.getAddress());
			pst.setString(1, customer.getAddress());
			pst.setString(1, customer.getAddress());
		
		}catch (Exception e) {
			
		}
		
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer=null;
		Statement statement = null;
		PreparedStatement pst;
		String get_customer_by_id="select * from customer_Servlets where id=?";
		try {
			pst=(PreparedStatement) connection.prepareStatement(get_customer_by_id);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				customer=new Customer
						(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("address"), 
						rs.getString("email"),
						rs.getString("phone"), 
						rs.getDate("dob"),
						rs.getDouble("purchage_capacity"));	
			}else {
				throw new CustomerNotFoundException("customer with id "+ id+ " is not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers=new ArrayList<>();
		Statement statement;
		Customer customer;
		try {
			statement = connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from customer_Servlets");
			while(rs.next()) {
				customer=new Customer
						(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("address"), 
						rs.getString("email"),
						rs.getString("phone"), 
						rs.getDate("dob"),
						rs.getDouble("purchage_capacity"));
			customers.add(customer);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		return customers;
	}

}
