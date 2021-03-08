package com.day10.session2;

import java.util.function.Supplier;

public class DemoSuppier {

	public static void main(String[] args) {
		Supplier<String> supplier=()->"hello to teju";
		String val=supplier.get();
		System.out.println(val);
		
		
		
		
		Supplier<Emp> supplier1=()->new Emp(2, "raj", 13224, "sales", "redw");
		Emp val2=supplier1.get();
		System.out.println(val2);
		
		
		Supplier<EmpData> supplier3=()->new EmpData("pooja", 20000);
		EmpData data=supplier3.get();
		System.out.println(data);
		
	}
	
}



