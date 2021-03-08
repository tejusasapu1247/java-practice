
interface cal{
	double Pi=3.14159;				//public static final by default.....
	double add(double a,double b);
	double sub(double a,double b);	
}
class MyCal implements cal{

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	public double sin(double deg) {
		double rad=deg*cal.Pi/180;
		return Math.sin(rad);
	}
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCal m=new MyCal();
		System.out.println(m.add(10.5, 10.5));
		System.out.println(m.sub(3.3, 2.22));
		System.out.println(m.sin(90));
		cal c;
		c=new MyCal();
		System.out.println(c.add(2.2, 10.5));
		System.out.println(c.sub(5.5, 2.22));
		//System.out.println(((MyCal) c).sin(20));
	}

}
