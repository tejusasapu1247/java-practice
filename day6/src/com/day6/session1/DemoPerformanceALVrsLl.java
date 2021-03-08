package com.day6.session1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class DemoPerformanceALVrsLl {

	public static void main(String[] args) {
		List<Long> list1=new ArrayList<>();
		LinkedList<Long> list2=new LinkedList<>();
calculate(list1);
	}

	private static void calculate(List<Long> list1) {
		for(long i=0;i<10E5;i++) {
			list1.add(i);
		}
		long start=System.currentTimeMillis();
		for(long i=0;i<10E5;i++){
			list1.add(0,i);	
		}
		long end=System.currentTimeMillis();
		System.out.println("time taken :" + (end-start));
	}

}
