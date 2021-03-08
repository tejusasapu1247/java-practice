package com.demo.jsp;

import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String email;
	private String phone;
	private Date dob;
	private double purchaseCapacity;
	
	public Customer() {}
	public Customer(String name, String address, String email, String phone, Date dob,
			double purchaseCapacity) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.purchaseCapacity = purchaseCapacity;
	}
	public Customer(int id,String name, String address, String email, String phone, Date dob,
			double purchaseCapacity) {
		this.id=id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.purchaseCapacity = purchaseCapacity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getPurchaseCapacity() {
		return purchaseCapacity;
	}
	public void setPurchaseCapacity(double purchaseCapacity) {
		this.purchaseCapacity = purchaseCapacity;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone="
				+ phone + ", dob=" + dob + ", purchaseCapacity=" + purchaseCapacity + "]\n";
	}
	
}
