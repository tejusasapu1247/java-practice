package com.objectClassDemo;

public class DemoGetClassMethod {

	public static void main(String[] args) {
		Object obj=new DemoGetClassMethod();
		System.out.println("class name       ="+ obj.getClass().getName());
		System.out.println("package name     ="+ obj.getClass().getPackageName());
		System.out.println("only class name  ="+ obj.getClass().getSimpleName());
		System.out.println("hash code        ="+ obj.getClass().hashCode());
		System.out.println("package name     ="+ obj.getClass().getPackageName());	
		System.out.println("package name     ="+ obj.getClass().getClass());	
		
	}

}
