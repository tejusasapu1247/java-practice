package com.day8.session1;

import java.io.*;

public class DemoCharStream {
	//
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo.txt");
		FileWriter fw = new FileWriter("demo1.txt");
		int i = 0;
		while ((i = fr.read()) != -1) {
			fw.write(i);
		}
		fw.flush();
		fw.close();
		System.out.println();
	}

}
