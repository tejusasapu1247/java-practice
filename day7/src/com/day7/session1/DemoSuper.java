package com.day7.session1;
import java.util.*;
class Animal{
}

class Dog extends Animal{
	
}
class CostlyCat extends Dog{
	
}
public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog>dogs=new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new CostlyCat());
		myMethod(dogs);
		
	}
	private static void myMethod(List<? super Dog> dogs) {
		// TODO Auto-generated method stub
		dogs.add(new CostlyCat());
		dogs.add(new Dog());
	}

}
