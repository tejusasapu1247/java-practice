package com.day4.session1;

//annonymous inner class : a class with no name
//it can not have ctr!
interface Cookable {
	public void cook();
}

//class StreatFood implements Cookable {
//
//	@Override
//	public void cook() {
//		// TODO Auto-generated method stub
//		System.out.print("good in taste ..");
//	}
//
//}

public class DemoAnnInnerClass {

	public static void main(String[] args) {
//
//		StreatFood food = new StreatFood();
//		food.cook();
		//java plz create an annonymous implementation of cookable interface
		//i dont care abt the name od that implwmentation 
		Cookable cook =new Cookable() {
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				System.out.print("good in health and light in pocket...");
			}
		};
		cook.cook();
		
		
	}

}
