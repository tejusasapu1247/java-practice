class Parent{
	public void print() {
		System.out.print("hello...");
	}
}
class Child extends Parent{
	public void print() {
		super.print();
		System.out.print("...world");
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.print();
		System.out.println();
		Child c=new Child();
		c.print();
	}

}
