
class Vehicle{}
class TwoWheeler extends Vehicle{}
class FourWheeler extends Vehicle{}
class Car extends TwoWheeler{}
class Bike extends FourWheeler{}
class Human{}
class Base{
	protected Vehicle getVehicle() {
		return null;
	}
}
class Derived extends Base{
	public Bike getVehicle() {
		return null;
	}
}
public class Main {
	public static void test(Vehicle v) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new Vehicle());
		test(new TwoWheeler());
		test(new FourWheeler());
		test(new Bike());
		test(new Car());
	//	test(new Human());
	}
}
