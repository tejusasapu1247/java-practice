package classesPrg3;
import java.util.LinkedList;
class ShoppingCart{
	
	private LinkedList<Object> products=new LinkedList<>(); 
	public void addToCart(String product) {
		products.add(product);
	}
	public void order() {
		System.out.println("ordered products are:");
		System.out.println(products);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart1=new ShoppingCart();
		cart1.addToCart("dress");
		cart1.addToCart("bag");
		cart1.addToCart("things");
		cart1.order();
		ShoppingCart cart2=new ShoppingCart();
		cart2.addToCart("a");
		cart2.addToCart("b");
		cart2.addToCart("c");
		cart2.order();
		
		
		
		
	}

}
