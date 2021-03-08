package com.day9.session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafeDsInJava {

	public static void main(String[] args) {
		//initially Array is not thread safe...We can make it threadsafe using following..
		List<Integer> list=Collections.synchronizedList(new ArrayList<>());
		
		
	}

}
