package com.day10.session2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoConsumerFI {

	public static void main(String[] args) {
		BiConsumer<String, String> bi=(t,u)->{};
		
		//Consumer<String> c=s->System.out.println(s);
		//c.accept("java 8 in action");	
		
		List<String> names=Arrays.asList("hi","teju","friend","moksha");
		//java 8 style:it is better in peformance and also support paraleel processing 
		Consumer<String> c=name->System.out.println(name);
		names.forEach(c);
		//names.forEach(name->System.out.println(name));
		
		
		//java 7 style
//		for(String s:names) {
//			System.out.println(s);
//		}
		Emp empTemp=new Emp(2, "teju ", 24325346, "TR", "sasapu");
		System.out.println(empTemp);
		
		Consumer<Emp> consumer=emp->System.out.println(emp);
		consumer.accept(empTemp);	
	
	
	}

}
