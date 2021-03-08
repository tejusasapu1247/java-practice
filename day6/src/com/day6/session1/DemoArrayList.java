package com.day6.session1;

import java.util.ArrayList;

import java.util.*;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("foo");
		list.add("car");
		list.add("bus");
		list.add("jar");
		list.add("hello");
		list.add("bye");
		list.add(1,"teju");

		// enhance for loop : syntXax--> Iterator pattern
//		for(String temp:list) {
//			System.out.println(temp);
//		}
		System.out.println("----using Iterator------");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----sorted using Coolections class-------");
		Collections.sort(list);
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		int ind = Collections.binarySearch(list, "hello");
		System.out.println(ind);

	}
}
