package com.day10.session1;
interface ImplLogic{
	public static int i=10;
	public void logic();
	default void logic1() {
		System.out.println("default method...");
	}
	public static void impLogicStaticMethod() {
		System.out.println("impLogicStaticMethod :"+i);
	}
	
}
class TeamA implements ImplLogic{

	@Override
	public void logic() {
		System.out.println("Team A is implementing the logic");
	}
	
}
class TeamB implements ImplLogic{
	
	
	@Override
	public void logic() {
		System.out.println("Team B is implementing the logic");
	}
	
	
}
public class InterfaceEvolution {

	public static void main(String[] args) {
		ImplLogic t1=new TeamB();
		t1.logic();
		ImplLogic.impLogicStaticMethod();
	}

}
