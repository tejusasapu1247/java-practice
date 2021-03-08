package com.day8.serilizationInheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class M implements Serializable{
	int m=3;
}
class N implements Serializable{
	int n=4;
	String name="raj";
	Integer marks=99;
	M mobj=new M();
	
	
	
}
public class SerComposition {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//serilization
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ser_comp.ser"));
		N n=new N();
		oos.writeObject(n);
		
		
		//de serilization
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ser_comp.ser"));
		ois.readObject();
	}

}
