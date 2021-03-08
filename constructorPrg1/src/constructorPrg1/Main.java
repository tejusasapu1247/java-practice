package constructorPrg1;
class Sample{
	private int val;
	public void print() {
		System.out.println(val);
	}
	Sample(){
	val=10;
	}
	Sample(int n){
		val=n;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ob=new Sample();
		ob.print();
		Sample ob1=new Sample(100);
		ob1.print();
	}

}
