package com.day8.session1;
import java.io.*;
public class DemoDataOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ois.txt"));
		
		for(int i=0;i<10;i++) {
			int temp=ois.readInt();
			double tempDouble=ois.readDouble();
			short tempShort=ois.readShort();
		}
		ois.close();
	
		
		
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("os.txt"));
		for(int i=0;i<10;i++) {
			oos.writeInt(i);
			oos.writeDouble(i+3.4);
			oos.writeShort(i);
		}
		oos.flush();
		oos.close();
		System.out.println("data is copied successfuly");
	}

}
