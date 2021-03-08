package com.day6.session1;

import java.util.*;

import javafx.scene.control.Tab;
class Student{
	private int roll;
	private String name;
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void prin() {
		System.out.println(name);
	}
	
}
public class DemoArrayListWithoutGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList();
		list.add("foo");
		list.add(7);
		list.add(new Integer(3));
		list.add("jar");
		list.add(new Student(1247, "teju"));
		list.add("bye");
		
		//enhance for loop : syntXax--> Iterator pattern
		for(Object temp:list) {
			System.out.println(temp);
		}
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
