package com.JdbcCustomerApplication.Model;

import java.util.Date;

public class Customer {
	private int custId;
	private String name;
	private long phone;
	private  String email;
	private Date birthDate;
	private String address;
	private long purchaseCapacity;
	
	public Customer(int custId, String name, long phone, String email, Date birthDate, String address,
			long purchaseCapacity) {
		this.custId = custId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.birthDate = birthDate;
		this.address = address;
		this.purchaseCapacity = purchaseCapacity;
	}
	public Customer() {
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public java.sql.Date getBirthDate() {
		return (java.sql.Date) birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPurchaseCapacity() {
		return purchaseCapacity;
	}
	public void setPurchaseCapacity(long purchaseCapacity) {
		this.purchaseCapacity = purchaseCapacity;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", birthDate=" + birthDate + ", address=" + address + ", purchaseCapacity=" + purchaseCapacity + "]";
	}
	public void printDetails() {
		System.out.println("\nCustpmer Id = " + getCustId() +
				          "\nName = " + getName() + 
				          "\nPhone = " + getPhone()+
		                  "\nEmail = " + getEmail() + 
		                  "\nBirthDate = " + getBirthDate() + 
		                  "\nAddress = " + getAddress()+
		                  "\nPurchaseCapacity = " + getPurchaseCapacity());
	}
	
	
	
	
	
	
	
}
