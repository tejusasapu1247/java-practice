package com.lab4Assisgnment.question1;

import java.io.*;

public class Question1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("data1.txt");
		//FileOutputStream fos = new FileOutputStream("data2.txt");
		DataInputStream d = new DataInputStream(fis);
		String line=null;
		while ((line = d.readLine()) != null) {
			System.out.println(line);
		}
	}
}


