package com.lab2assignment.q5;

public class Convertable extends Car {
	private boolean isHoodOpen;

	public Convertable(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		super.display();
		System.out.println("Is the hood opened? " + isHoodOpen);
	}

}
