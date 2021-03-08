package com.day7.session1;
import java.util.*;
public class DemoGenerics {

	public static void main(String[] args) {
		//generics is a compile time safty net! i.e, jvm don't know anything about 
		List<Integer> list=new ArrayList<Integer>();
		list.add(22);
		list.add(23);
		list.add(45);
		list.add(56);
		System.out.println("----integer list------");
		print(list);
		List<Double> list1=new ArrayList<Double>();
		list1.add(22.7);
		list1.add(23.5);
		list1.add(45.4);
		list1.add(56.2);
		System.out.println("----Double list------");
		print(list1);
		List<String> list2=new ArrayList<String>();
		list2.add("hello");
		list2.add("hi");
		list2.add("teju");
		list2.add("bye");
		System.out.println("----String  list------");
		print(list2);
		
}
	//using ? extends Number ==>we can onlt print but we can't modify it 
	// we can use -->private static void print(List<?> list) {
	private static void print(List<?extends Object> list) {
		for(Object in:list) {
			System.out.println(in);
		}
	}
}
