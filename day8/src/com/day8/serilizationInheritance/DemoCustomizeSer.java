package com.day8.serilizationInheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	private int id;
	private String name;
	private String password;
	private String roles;
	//deserilization process
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		System.out.println("read obj is called...");
		ois.defaultReadObject();
		this.password=password.substring(2,password.length());
		}
	//serilization process
	private void writeObject(ObjectOutputStream oos) throws IOException {
		String encodedPassword="@#$%$"+password;
		oos.defaultWriteObject();
		System.out.println("write obj is called...");
		
	}
	public User() {}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public User(int id, String name, String password, String roles) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", roles=" + roles + "]";
	}
	
}


public class DemoCustomizeSer {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// /ser
		User u=new User(121,"raj","12sds","ADMIN");
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream( "demoserinh.ser"));
        oos.writeObject(u); 
        System.out.println(u.toString());
        System.out.println("done");

		// de-ser

		// instance control flow
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demoserinh.ser"));
		User u2 = (User) ois.readObject();
		System.out.println(u2.toString());

	}

}
