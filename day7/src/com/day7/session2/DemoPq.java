package com.day7.session2;
import java.util.*;

import com.day7.session1.Student;
public class DemoPq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> pq=new PriorityQueue<>();
		pq.add(new Student(121, "teju", 99));
		pq.add(new Student(1, "moksha", 89));
		pq.add(new Student(11, "rahul", 97));
		pq.add(new Student(12, "tej", 90));
		pq.add(new Student(21, "rowdy", 59));
		Iterator<Student> it=pq.iterator();
		//using iterator won't give the order...
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----using remove method----");
		while(!pq.isEmpty()) {

			System.out.println(pq.remove());
		}

		
	
	
	}

}
