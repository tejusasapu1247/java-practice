package staticPrg1;

class Mymath{
	public static int  add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
}
class Sample{
	int value;
	public void set(int x) {
		value=x;
	}
	public int get() {
		return value;
	}
}

public class Main {
	public static void main(String args[]) {
		//Mymath ob=new Mymath();
		int a=Mymath.add(20,10);
		int b=Mymath.sub(20,10);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		Sample obj=new Sample();
		obj.set(23);
		System.out.println("obj value="+obj.get());
	
	
	}
}
