package com.day8.serilizationInheritance;

import java.io.*;

class A {
	int i;

	A(int i) {
		this.i = i;
	}
}

class B extends A implements Serializable {
	int j;

	B(int i, int j) {
		super(i);
		this.j = j;
	}

}

public class SerInheritance {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// /ser

          B b = new B(1, 2); ObjectOutputStream oos = new
         ObjectOutputStream(new FileOutputStream( "demoserinh.ser"));
          oos.writeObject(b); System.out.println("done");

		// de-ser

		// instance control flow
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demoserinh.ser"));
		B b2 = (B) ois.readObject();
		System.out.println(b2.i + " : " + b2.j);

	}

}