package com.day10.foodApp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Dish> dishes = getAllDishes();
		System.out.println(".......printing all the dishes....");
		dishes.forEach(dish -> System.out.println(dish));

		List<String> disheNames = dishes.stream().filter(dish -> dish.getCalories() < 500)
				.sorted(Comparator.comparing(Dish::getCalories)).map(dish -> dish.getName()).sorted()
				.collect(Collectors.toList());

		System.out.println(".......printing all the dishes having calories <400....");
		disheNames.forEach(name -> System.out.println(name));

		// find out whether the menu has a vegitarian option
		boolean isVegOption = dishes.stream().anyMatch(d -> d.isVegetarian());
		if (isVegOption)
			System.out.println("yes....njy the food..");
		else
			System.out.println("no veg food....you can have the juice.....");

		// find out whether the food is good or not by calories<400
		boolean isGood = dishes.stream().allMatch(d -> d.getCalories() < 400);
		if (isGood)
			System.out.println("yes...the food is good and healthyy.");
		else
			System.out.println("no....food is there which having >400 calories...");

		 //optFood= dishes.stream().filter(dish->dish.isVegetarian()).findAny();
	}

	private static List<Dish> getAllDishes() {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

		return menu;
	}
}
