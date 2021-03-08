package com.lab2assignment.q5;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;

	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;

	}

	public String getMake() {
		return make;
	}

	public int getModel() {
		return model;
	}

	public int getNoOfWheel() {
		return noOfWheel;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void display() {
		System.out.println("make :" + make + "\nmodel :" + model + "\nno.of wheels :" + noOfWheel
				+ "\nno.of passengers :" + noOfPassenger);
	}

	@Override
	public String toString() {
		return "Vehicle [noOfWheel=" + noOfWheel + ", noOfPassenger=" + noOfPassenger + ", model=" + model + ", make="
				+ make + "]";
	}

}
