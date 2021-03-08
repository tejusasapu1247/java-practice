package a.b;

public class A {
       public int a=20;
       protected int b=20;
       private float c=30.3f;
       public void printPublic() {
    	   System.out.println("this is a publi method from A");
       }
       @SuppressWarnings("unused")
	private void printProtected() {
    	   System.out.println("this is protected method from A");
	}
       
}
