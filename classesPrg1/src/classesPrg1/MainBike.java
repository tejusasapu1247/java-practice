package classesPrg1;
class Bike{
	boolean power;
	int speed;
	public Bike(boolean pw, int sp) {
		// TODO Auto-generated constructor stub
		this.power=pw;
		this.speed=sp;
	}
	void start() 
	{
		power=true;
		speed=0;
	}
	void stop()
	{
		power=false;
		speed=0;
	}
	void accelerate(int newSpeed)
	{
		speed=newSpeed;
	}
	void printState() {
		System.out.println("current state");
		System.out.println("power="+power);
		System.out.println("Speed="+speed);
	}
}
class Scooty extends Bike{
	char color='G';
	int price;
	Scooty( boolean pw,int sp,char c,int p){
		super(pw,sp);
		this.color=c;
		this.price=p;
	}
	public int getPrice() {
		return price;
	}
	public char getColor() {
		return color;
	}
	public void printState() {
		System.out.println("current state");
		System.out.println("power="+power);
		System.out.println("Speed="+speed);
		System.out.println("price of scooty = "+getPrice());
	}
	
}
public class MainBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bike b1,b2;
//		b1=new Bike(false, 0);
//		b2=new Bike(false, 0);
//		b1.start();
//		b2.start();
//		
//		b1.accelerate(30);
//		b1.printState();
//		b2.printState();
		Bike sc=new Scooty(false,0,'G',10000);
		sc.printState();
		if(sc instanceof Scooty) {
			char color=((Scooty) sc).getColor();
			System.out.println("the color code = "+color);
		}
		else
		{
			System.out.println("this sc is not a bike");
		}
	}

}
