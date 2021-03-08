package inheritancePrg1;

class basicCal{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
}
class ScientificCal extends basicCal{
	public int mul(int a,int b) {
		return a*b;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientificCal b1=new ScientificCal();
		System.out.println(b1.add(20,10));
		System.out.println(b1.sub(30,5));
		basicCal b2=new ScientificCal();
		System.out.println(b2.add(12, 13));
		System.out.println(b2.sub(15, 13));
		System.out.println(((ScientificCal) b2).mul(2,3));
		basicCal b3=new basicCal();
		System.out.println(b3.add(2, 3));
		System.out.println(b3.sub(4, 3));
		
		
	}

}
