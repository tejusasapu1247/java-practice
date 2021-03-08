package com.day3.session1.loosecoupling;

abstract class Vehical {
	public abstract void move(String source, String destination);
}

class Metro extends Vehical {
	public void move(String source, String destination) {
		System.out.println("moving in metro from :" + source + " to " + destination);
	}
}
class Car extends Vehical {
	public void move(String source, String destination) {
		System.out.println("moving in car from :" + source + " to " + destination);
	}
}
class Bike extends Vehical {
	public void move(String source, String destination) {
		System.out.println("moving in Bike from :" + source + " to " + destination);
	}
}
class Cab extends Vehical {
	public void move(String source, String destination) {
		System.out.println("moving in Cab from :" + source + " to " + destination);
	}
}
	class Passanger {
		private String name;

		public Passanger(String name) {
			this.name = name;
		}

		public void travel(String source, String destination, Vehical vehical) {
			vehical.move(source, destination);

		}
	}

class DemoLooseCoupling {

	public static void main(String args[]) {
		Vehical v = new Car();
		Passanger p = new Passanger("teju");
		p.travel("rajam", "palakonda",v);
	}

}
