package shopingCart;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer("teju","moksha");
		//c.setName("teju");
		System.out.println(c.getName());
		//c.setSsn("12a20");
		System.out.println(c.getSsn());
		Order od=new Order("MOKSHA", 910.00, "AP", Order.PRIVATE);
		System.out.print("Discount= "+od.getDiscount());
	}

}
