package com.day2.session1.stackApp;
class Box3D extends Box2D{
	
	private int h;
	public Box3D(int l, int b,int h) {
		super(l,b);
		this.h = h;
	}
	public void print() {
		super.print();
		System.out.println("height = "+ h);
	}
}