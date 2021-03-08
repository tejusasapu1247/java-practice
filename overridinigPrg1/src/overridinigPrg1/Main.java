package overridinigPrg1;
class Base{
	public void g() {
		System.out.println("g() is from base");
	}
	public void h() {
		System.out.println("h() is from Base");
	}
}
class Derived extends Base{
	public void h() {
		System.out.println("h() is from derived...");
	}
	public void i() {
		System.out.println("i() is from Derived...");
	}



}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.g();
		b.h();
		Derived d=new Derived();
		d.g();
		d.h();
		d.i();
		Base b1=new Derived();
		((Derived)b1).i();
	}

}
