package com.day7.session2;
import java.util.*;
public class ConvertingArrayToAl {

	public static void main(String[] args) {
		String names[]= {"hii","teju","how","are",null};
		List<String>list=Arrays.asList(names);
		System.out.println(list);
		names[0]="hoooy";
		names[4]="rajuuu";
		System.out.println(list);
		//we can't do it because of array length is 4 only
		list.add("helloooo");
		

	}

}
