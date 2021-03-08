package com.day8.serilizationInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyDemo implements Serializable{
	private int id;

	public MyDemo(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Object readResolve() {
		System.out.println("hey java...call it but don't do serilization...");
		return this;
	}
	
}
public class DemoReadResolveMethod {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// /ser
		MyDemo demo=new MyDemo(23);
		ObjectOutputStream oos= new  ObjectOutputStream(new FileOutputStream( "foo.ser"));
        oos.writeObject(demo);
        System.out.println(demo.hashCode());
		// de-ser
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("foo.ser"));
		MyDemo mydemo= (MyDemo) ois.readObject();
		System.out.println(mydemo.hashCode());
		if(mydemo==demo) {
			System.out.println("these two objs are same...");
		}else {
			System.out.println("these are not same...");
		}
	}

}
