package com.lab4Assignment.question3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationAndDeserilization {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("object.ser"));
		Employee emp = new Employee(1, "teju", "Srikakulam");
		os.writeObject(emp);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		try {
			Employee emp1= (Employee) ois.readObject();
			emp1.display();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}