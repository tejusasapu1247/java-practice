package com.day5.session2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaARM {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(new File("data")))) 
			{
				System.out.println("helloo");
			}catch (IOException e) {
				// TODO: handle exception
				System.out.println("file not found");
			}
//		BufferedReader br = null;
//		// TODO Auto-generated method
//		try {
//			String line=null;
//			br = new BufferedReader(new FileReader(new File("data")));
//			System.out.println("file is found");
//			while((line=br.readLine())!= null) {
//		    	System.out.println(line);
//		    }
//		}catch (FileNotFoundException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		} 
//		catch (IOException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		finally {
//			try {
//			br.close();
//		}catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		}
		
	}
}
