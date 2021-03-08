package com.day3.session.ex25;

public class MyTriangle {
private MyPoint pointA;
private MyPoint pointB;
private MyPoint pointC;
public MyTriangle(MyPoint pointA, MyPoint pointB, MyPoint pointC) {
	this.pointA = pointA;
	this.pointB = pointB;
	this.pointC = pointC;
}
public MyTriangle(int x1,int y1,int x2,int y2,int x3, int y3) {
	this.pointA = new MyPoint(x1,y1);
	this.pointB = new MyPoint(x2,y2);
	this.pointC = new MyPoint(x3,y3);
}
@Override
public String toString() {
	return "MyTriangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
}



}
