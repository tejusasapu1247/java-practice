package com.day8.session1;

import java.io.*;

public class DemoByteSream {
	//
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("img.jpg");
		FileOutputStream fos = new FileOutputStream("img2.jpg");
		//FileWriter fw = new FileWriter("demo1.txt");
		int i = 0;
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}
		fos.flush();
		fos.close();
		System.out.println("image is copied...");
	}

}
