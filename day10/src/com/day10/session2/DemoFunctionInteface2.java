package com.day10.session2;

import java.util.function.Function;

public class DemoFunctionInteface2 {

	public static void main(String[] args) {
	Function<Emp, EmpData> function=emp->new EmpData(emp.getName(),emp.getSalary());
	
	Emp e1=new Emp(1, "jay", 50000, "HR", "littleHero");
	EmpData data=function.apply(e1);
	System.out.println(data);
	
			
	}

}
