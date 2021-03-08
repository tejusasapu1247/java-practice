package com.day10.session2;

import java.util.function.Function;

public class DemoFunInterface {

	public static void main(String[] args) {
		//I want to get the name of person from employeee object
		//Employee.....->string
		Function<Emp,String> function=emp->emp.getName();
		Emp empTemp=new Emp(121,"teja",12345,"IT","moksha");
		Function<Emp, String> function2= emp->emp.getName().concat(emp.getLastname()); 
		System.out.println(function2.apply(empTemp));	
		}
	
	
	}
