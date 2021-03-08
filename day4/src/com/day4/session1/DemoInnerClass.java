package com.day4.session1;


class Outer{
	
	private int i=10;
	class Inner{
		private int i=20;
//		Integer val=new Integer(null);
		
		public void doInner() {
			
			System.out.println("doInner of inner class..."+Outer.this.i+"\nthis is from inner classs: "+this.i);
		}
	}
	public void doOuter() {
		//inner class must be assosiated with a valid obj of outer class
		Inner inner= new Inner();
		inner.doInner();
	}
}

public class DemoInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer outer= new Outer();
		Outer.Inner inner= outer.new Inner();
		//Outer.Inner inner=new Outer().new Inner();
		inner.doInner();

	}

}
