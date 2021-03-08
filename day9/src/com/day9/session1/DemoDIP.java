package com.day9.session1;
interface Engine{
	public void engineDetails();
}
class TurboEngine implements Engine{
	private int hp;
	private String brand;
	
	public TurboEngine(int hp, String brand) {
		super();
		this.hp = hp;
		this.brand = brand;
	}
	@Override
	public void engineDetails() {
		System.out.println("using turbo engine :"+hp+": brand :"+brand);
	}
	
}
class V8Engine implements Engine{
	private int hp;
	private String brand;
	
	public V8Engine(int hp, String brand) {
		this.hp = hp;
		this.brand = brand;
	}
	@Override
	public void engineDetails() {
		System.out.println("using V8 engine :"+hp+": brand :"+brand);
	}
	
}
class Car{
	private Engine engine;
	public Car(Engine engine) {
		//engine=new TurboEngine(200,"foo");
		this.engine=engine;
		}
	public void move() {
		System.out.println("moving a race car...");
		engine.engineDetails();
	}
			
	}

public class DemoDIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine=new TurboEngine(200,"foo");
		//Engine engine1=new V8Engine(2003,"foof");
		Car car=new Car(engine);
		car.move();
	}

}
