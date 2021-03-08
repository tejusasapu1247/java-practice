package com.day10.foodApp;


//enum CaloricLevel { DIET, NORMAL, FAT };

class Dish {
	private  String name;
		private  boolean vegetarian;
		private  int calories;
		private  Type type;
	public enum Type {
		MEAT, FISH, OTHER
		}
	
	public Dish(String name, boolean vegetarian, int calories, Type type) {
		
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", type=" + type + "]";
	};
		
}

