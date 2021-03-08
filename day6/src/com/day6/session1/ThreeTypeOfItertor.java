package com.day6.session1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ThreeTypeOfItertor {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		list.add("kar");
		list.add("bus");

		System.out.println("----using Iterator----");
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		// Doing crud operation with ListIterator
		System.out.println("----using ListIterator----");
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String val = it.next();
			// update operation
			if (val.equals("jar")) {
				it.set("jar file");
			}

			if (val.equals("bus")) {
				it.add("gov bus");
			}
			if (val.equals("bar")) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}
