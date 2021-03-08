
class Sample{
	static {
		System.out.println("this is a static initializer...");
	}
	 {
		System.out.println("this is a non static initialiser.... ");
	}
}

public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj1=new Sample();
		Sample obj2=new Sample();
		Sample obj3=new Sample();
	}

}
