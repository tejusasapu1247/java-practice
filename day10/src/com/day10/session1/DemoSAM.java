package com.day10.session1;

import java.util.function.Consumer;

@FunctionalInterface
interface Foof{
	public void foof();
	boolean equals(Object ojb);
	public static void foofStatic() {
		System.out.println("static method..");
	}
	public default void foofDefault() {
		System.out.println("Default method in interface..");
	}
}
//@FunctionalInterface
//interface A extends Foof{
//	public void foof2();
//}
class Demo implements Foof{

	@Override
	public void foof() {
		System.out.println("foof method is implemented in class DEmo");
	}
	public void foofDefault() {
		System.out.println("Default method..");
	}
}
public class DemoSAM {

	public static void main(String[] args) {
		Demo d=new Demo();
		Consumer<Demo> consumer=obj->obj.foofDefault();
		consumer.accept(d);
				
	}

}
