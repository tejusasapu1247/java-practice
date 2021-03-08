package com.day7.session1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoMap {

	public static void main(String[] args) {
		Map<String ,Integer>set=new TreeMap<String,Integer>();
		set.put("asdsaf",12);
		set.put("cdefe",12);
		set.put("dsaedr",12);
		set.put(null,12);//cannot allow null key...
		set.put("moksha",null);
		for (Map.Entry<String, Integer> entry : set.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
			
	}

}
