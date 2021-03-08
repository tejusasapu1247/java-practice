package com.day6.session2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---HashSet-----");
		HashSet<String> set = new HashSet<String>();
		set.add("teju");
		set.add("adqsaju");
		set.add("tsfsu");
		set.add("weadx");
		System.out.println(set);
		System.out.println("---TreeSet-----");
		
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("teju");
		set1.add("adqsaju");
		set1.add("tsfsu");
		set1.add("weadx");
		System.out.println(set1);
		//Iterator<String > it=
		System.out.println("---LinkedHashSet-----");
		LinkedHashSet<String> set3 = new LinkedHashSet<String>();
		set3.add("teju");
		set3.add("adqsaju");
		set3.add("tsfsu");
		set3.add("weadx");
		System.out.println(set3);
		
		
	
	
	
	}

}
