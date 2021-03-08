package com.day7.session1;
interface Liquidity{
	
}
interface Drinkable{
	
}

class Juice implements Liquidity,Drinkable{
	
}
class Water implements Liquidity,Drinkable{
	
}
class Glass<T extends Liquidity & Drinkable>{
	private T liquid;

	public T getLiquid() {
		return liquid;
	}

	public void setLiquid(T liquid) {
		this.liquid = liquid;
	}

	
}
public class SomeMoreExamplegeneric {

	public static void main(String[] args) {
		Glass<Water> g=new Glass<>();
		g.setLiquid(new Water());
		
		g=g.getLiquid();
		Glass<Juice> g2=new Glass<>();
		g2.setLiquid(new Juice());
		
		Glass<Water> g3=new Glass<>();
		g3.setLiquid(new Cake());

	}

}
