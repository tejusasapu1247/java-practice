package com.lab2assignment.q5;

import java.util.Scanner;

public class VehicleTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println(
					"\nChoose the optins below :\n1.To create object of Vehicle Class \n2.To create object of Car Clas"
							+ "\n3.To create object of Convertable Clas \n4.To create object SportCar Clas \n0.To exit ");
			choice = scanner.nextInt();
			if (choice == 1) {
				Vehicle vehicle = new Vehicle(8, 50, 123, "bus");
				vehicle.display();
			} else if (choice == 2) {
				Car car = new Car(4, 3, 3542, "car", 4);
				car.display();
			} else if (choice == 3) {
				Convertable convertable = new Convertable(4, 2, 123, "convertable", 4, true);
				convertable.display();
			} else if (choice == 4) {
				SportCar scar = new SportCar(4, 1, 1234, "SportCar", 2);
				scar.display();
			} else if (choice > 4 || choice < 0) {
				System.out.println("sorry!!!!choose the correct option\n");
			} else if (choice == 0) {
				System.out.println("thank you!!!!!!");
			}
		} while (choice != 0);

	}
}
