package constructorPrg1;

class Complex{
	private double real,img;
	
	public Complex() {
		real=0;
		img=0;
	}
	public Complex(double r) {
		real=r;
		img=0;
	}
	public Complex(double r,double i) {
		real=r;
		img=i;
	}
	public void print() {
		System.out.println(real+"+i"+img);
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1,c2,c3;
		c1=new Complex();
		c2=new Complex(5);
		c3=new Complex(2,3);
		c1.print();
		c2.print();
		c3.print();
		
	}

}
