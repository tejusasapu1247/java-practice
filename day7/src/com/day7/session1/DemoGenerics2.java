package com.day7.session1;
//hey you need to find the max of any three objects
import com.day7.session1.Student;

class DemoGenerics2 implements Comparable<T> {

	public static void main(String[] args) {
		Integer a=5;
		Integer b=4;
		Integer c=-1;
		Integer max=findMax(a,b,c  );
		System.out.println(max);
		
		
		Student student1=new Student(121, "teju", 99);
		Student student2=new Student(122, "ramu", 28);
		Student student3=new Student(123, "somu", 45);
		Student studentMax=findMax(student1, student2, student3);
		
	}

	private static Student findMax(Student student1, Student student2, Student student3) {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.g);
	}

	

	

}
