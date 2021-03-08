package com.lab4Assignment.question2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question2CharcterStream {
	public static void main(String [] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data:");
		String name =sc.nextLine();
		char [] charArr= name.toCharArray();
		FileWriter fw = new FileWriter("charcaterFile.txt");
		for(int i=0;i<charArr.length;i++) {
		fw.write(charArr[i]);
	}
	System.out.println("data copied from commandpromt to file successfully");
	fw.flush();
	fw.close();
	sc.close();
	
}
}

