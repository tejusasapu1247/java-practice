package abstractPrg2;

abstract class Base{
	public abstract void f();
	public abstract void g();
	public void h() {
		System.out.println("h() is from base");
	}
}

abstract class Derived extends Base{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("f() is from derived");
	}
}
class Derived1 extends Derived{
	@Override
	public void g() {
		// TODO Auto-generated method stub
		System.out.println("g() is from derived");
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b;                                     // """we cannot create object directly for abstract class because
//		b=new Base();								  //   it not not implemented.....that is y we r creating object for Derived1...
		Derived d;									
//		d=new Derived();	
		Derived1 d1=new Derived1();		//""we can create object directly for Derived1 because it is a concrete class...""	
		b=new Derived1();
		d=new Derived1();
		b.f();
		b.g();
		b.h();
		
		d.f();
		d.g();
		d.h();
		
		d1.f();
		d1.g();
		d1.h();
	}

}
