package com.day16.session1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Datepractice {

	public static void main(String[] args) throws ParseException {
//		String dateString =null;
//		Scanner sc=new Scanner(System.in);
//		dateString=sc.nextLine();
//		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
//		Date date=format.parse(dateString);
//		System.out.println(date);
		
		
		
		//How to set the particular date
		LocalDate localdate=LocalDate.of(2020, Month.NOVEMBER,06);
		System.out.println(localdate);
		
		
		//getting current date
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		//How to convert String to localdate
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("d/MM/yyy");
		String date="16/11/2020";
		LocalDate date2=LocalDate.parse(date,formatter);
		System.out.println(date2);
		

		
		
		
		
		
		
		
	}

}
