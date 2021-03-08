package com.day3.session2;


interface MathConstants{
	static final double pi=Math.PI; 
}
class MathLib2 implements MathConstants{
	public int cal2() {
		double val=pi+3;
		return (int) val;
	}
}

public class UseOfInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathLib2 math=new MathLib2();
		int val=math.cal2();
		System.out.println(val);
	}
}
