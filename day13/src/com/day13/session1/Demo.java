package com.day13.session1;

import java.lang.reflect.Constructor;

/**
 * @author 91918
 * @since03-11-2020
 *
 */
public class Demo {
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Car car1=new Car();
		Car car2=new Car();
		//System.out.println(car1.getClass());
		//System.out.println(car2.getClass());
	Class clazz=Class.forName("com.day13.session1.Car");
	System.out.println(clazz);
	Constructor[] c=clazz.getConstructors();
	System.out.println(c.toString());
	Runtime r= Runtime.getRuntime();
	//memory occupied by the current program
	double mb=1024*1024;
	System.out.println(r.freeMemory()/mb);
	
	
	//Garbage collector
	long availableMemroy=r.getRuntime().freeMemory();
	System.out.println("free memory :"+availableMemroy/1024);
	for(long t=0;t<10000;t++) {
		Car cars=new Car();
	}
	System.gc();
	availableMemroy=r.getRuntime().freeMemory();
	System.out.println("free memory :"+availableMemroy/1024);
	
	
	
	
	}

}
