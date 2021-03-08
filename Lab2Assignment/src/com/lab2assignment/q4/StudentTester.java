package com.lab2assignment.q4;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		Student student = new Student("teju", "51894835", 90.2);
		student.display(2020);
		System.out.println("------------------");
		Student student1 = new Student("moksha", "51894835");
		student1.display();
		System.out.println("------------------");
		Student student3 = new Student("Amit");
		student3.display(2020);

	}

}
