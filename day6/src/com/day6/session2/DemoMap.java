package com.day6.session2;

import java.util.*;
import java.util.Map.Entry;

public class DemoMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("teju", 1247);
		map.put("pooja", 342);
		map.put("ram", 123);
		map.put("rahul", 2345);

//		Set<String> keys=map.keySet();
//		for(String key:keys) {
//			System.out.println("key = "+key +" value = "+map.get(key));
//		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry:entrySet) {
			System.out.println("key = "+entry.getKey() +" value = "+entry.getValue());
			
		}
	}

}
