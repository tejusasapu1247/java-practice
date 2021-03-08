package com.day10.session2.appleApp;

import java.util.*;
import java.util.function.Predicate;

class Apple{
	private String color;
	private int weight;
	//if we ant to give 
	public boolean isGreen() {
		return color.equals("green");
	}
	public boolean isHeavy() {
		return weight>300;
	}
	public boolean isGreenAndHeavy() {
		return color.equals("green") && weight>300;
	}
	
	public Apple() {}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}
	
}
class AppleApp{
	
	public static List<Apple> getAllApplesOnPredicate(List<Apple> apples,Predicate<Apple> applePredicate){
		
		List<Apple> templist=new ArrayList<>();
		for(Apple apple:apples) {
			if(applePredicate.test(apple)) {
				templist.add(apple);
			}
		}
		return templist;
	}
//	public List<Apple> getAllGreenApples(List<Apple> apples){
//		List<Apple> templist=new ArrayList<>();
//		for(Apple apple:apples) {
//			if(apple.getColor().equalsIgnoreCase("green")) {
//				templist.add(apple);
//			}
//		}
//		return templist;
//	}
//	public List<Apple> getAllGreenAndHeavyApples(List<Apple> apples){
//		List<Apple> templist=new ArrayList<>();
//		for(Apple apple:apples) {
//			if(apple.getWeight()>300 && apple.getColor().equalsIgnoreCase("green") ) {
//				templist.add(apple);
//			}
//		}
//		return templist;
//	}
//	
}
public class Main {

	public static void main(String[] args) {
	List<Apple> apples=getAllApples();
	Predicate<Apple> heavyApplesPredicate=apple->apple.getWeight()>300;
	Predicate<Apple> greenApplesPredicate=apple->apple.getColor().equals("green");
	Predicate<Apple> greenAndHeavyApplesPredicate=greenApplesPredicate.and(heavyApplesPredicate);
	System.out.println("....green apples....");
	List<Apple> greenA=AppleApp.getAllApplesOnPredicate(apples,greenApplesPredicate);
	greenA.forEach(apple->System.out.println(apple));
	
	System.out.println("....heavy apples....");
	List<Apple> HeavyA=AppleApp.getAllApplesOnPredicate(apples,heavyApplesPredicate);
	HeavyA.forEach(apple->System.out.println(apple));
	
	System.out.println("....green and heavy apples....");
	List<Apple> HeavyAndGreenA=AppleApp.getAllApplesOnPredicate(apples,greenAndHeavyApplesPredicate);
	HeavyAndGreenA.forEach(a->System.out.println(a));
	}

	private static List<Apple> getAllApples() {
		List<Apple> apples=new ArrayList<Apple>();
		apples.add(new Apple("red", 234));
		apples.add(new Apple("green", 23));
		apples.add(new Apple("green", 200));
		apples.add(new Apple("red", 345));
		apples.add(new Apple("green", 634));
		return apples;
	}

}
