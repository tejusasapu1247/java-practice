package com.day10.session2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class DemoEmp {

	public static void main(String[] args) {
		List<Emp> emps = getEmps();
		
		//emps.stream().forEach(emp -> System.out.println(emp));
		//we want to get the name
		//of the emp that is getting salaries <2500
		//sort as per the name
		List<String> names=emps.stream()
				.filter(emp->emp.getSalary()<2500)
				.map(Emp::getName)//emp->emp.getName())
				.sorted(Comparator.reverseOrder())//you are sorting the names now...in reverse order
				.limit(5)
				.collect(Collectors.toList());
		System.out.println("......printing employess having salary<2500....");
		names.forEach(System.out::println);	
		
	
		List<String> fullnames=emps.stream()
				.map(emp->emp.getName().concat(emp.getLastname()))
				.collect(Collectors.toList());
		System.out.println("......printing employessfull names....");
		fullnames.forEach(n->System.out.println(n));
	
		List<Integer> ids=emps.stream()
				               .map(emp->emp.getId())
				               .sorted()
				               .collect(Collectors.toList());
		System.out.println("......printing employessfull ids....");
		ids.forEach(n->System.out.println(n));
	
	
	
	
	
	}
	
	
	
	private static List<Emp> getEmps() {
		List<Emp> emp = new ArrayList<>();
		emp.add(new Emp(121, "raja", 5000, "gupta", "sales"));
		emp.add(new Emp(21, "gunika",  6000,"gupta", "it"));
		emp.add(new Emp(1921, "amit",  2300, "kumar","it"));
		emp.add(new Emp(1210, "umesh",  4000, "kumar","mkt"));
		emp.add(new Emp(1231, "hari", 1200,  " sharma","mkt"));
		emp.add(new Emp(1991, "pooja",  700, " kumari","it"));
		return emp;

	}
	
	
	
}
