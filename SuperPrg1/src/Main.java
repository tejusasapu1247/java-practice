
class Base{
	protected int a,b;
	public Base(){
		
	}
	public Base(int x,int y) {
		this.a=x;
		this.b=y;
	}
	public void print() {
		System.out.println("this if from Base..");
	}
	public int add() {
		return a+b;
	}
}
class Derived extends Base{
	private int z;
	public Derived() {
		
	}
	public Derived(int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
		// TODO Auto-generated constructor stub
	public int sum() {
		return a+b+z;
	}
	public void print() {
		System.out.println("this is from derived class.....");
	}
	
}


public class Main {
	public static void main(String args[]) {
		Base b=new Base(2,3);
		b.print();
		System.out.println(b.add());
		Derived d=new Derived(1,2,4);
		d.print();
		System.out.println(d.sum());
		
	}
}
