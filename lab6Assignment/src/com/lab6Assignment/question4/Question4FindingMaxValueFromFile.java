package com.lab6Assignment.question4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Question4FindingMaxValueFromFile  {

	public static void main(String[] args) throws IOException {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
			String line=null;
			List<Double> list=new ArrayList<>();
			while ((line = dis.readLine()) != null) {
				list.add(Double.parseDouble(line));
			}
			
			Collections.sort(list);
			System.out.println("...printing all the values from data file.....");
			list.forEach(System.out::println);
			
			System.out.println("The maximum Value ="+ list.get(list.size()-1));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	
}
