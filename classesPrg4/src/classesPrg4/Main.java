package classesPrg4;
class Sample{
	public void print(int a) {
		System.out.println("int.."+a);
	}
	public void print(double a) {
		System.out.println("double..."+a);
	}
	public void print(String a) {
		System.out.println("string..."+a);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ob=new Sample();
		ob.print(10);
		ob.print(10.012);
		ob.print("t");
	}

}
