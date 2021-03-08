package com.day8.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSerilization {
	//
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"));
		Emp emp=(Emp) ois.readObject();
		System.out.println(emp);
	}

}
