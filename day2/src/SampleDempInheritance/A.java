package SampleDempInheritance;

public class A {
	private int i;
	public A(int i) {
		this.i=i;
	}
	public void print() {
		System.out.println("i =" + i);
	}
}

class B extends A {
	private int j;
	public B(int i, int j) {
		super(i);
		this.j = j;
	}

	public void print() {
		super.print();
		System.out.println("j =" + j);
	}
}
class C extends B{
	private int k;


	public C(int i,int j,int k) {
		super(i,j);
		this.k = k;
	}
	public void print() {
		super.print();
		System.out.print("k = "+k);
	}
}
class MainDemo{
	public static void main(String args[]) {
		C c=new C(1,2,3);
		c.print();
	}
}