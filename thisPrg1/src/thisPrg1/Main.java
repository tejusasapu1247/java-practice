package thisPrg1;
class Sample{
//	private int value;
//	public void set(int value) {
//		this.value=value;
//	}
	private int value;
	public Sample() {
		value=123;
	}
	public Sample(int value) {
		this.value=value;
	}
	public void print() {
		System.out.println(this.value);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1,s2;
		s1=new Sample();
		s2=new Sample(10);
		//s1.set(10);
		s1.print();
		//s2.set(24);
		s2.print();
	}

}
