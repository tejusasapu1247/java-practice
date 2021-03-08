package com.day7.session2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DemoDate {

	public static void main(String[] args) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/mm/yyyy");
		LocalDate localdate=LocalDate.parse("23/10/2020",f) ;
		System.out.println(localdate);
		
	}
	

}
