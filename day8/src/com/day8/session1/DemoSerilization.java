package com.day8.session1;
import java.io.*;
public class DemoSerilization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.ser"));
	Emp emp=new Emp(121, "teju", 50000);
	emp.setCompanyname("hcl");
	System.out.println(emp);
	oos.writeObject(emp);
	System.out.println("onject is written");
	}

}
