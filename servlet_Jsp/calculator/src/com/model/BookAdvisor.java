package com.model;

import java.util.ArrayList;
import java.util.List;

public class BookAdvisor {
	public static List<String> getBooks(String topic){
		List<String> books=new ArrayList<>();
		if(topic.equals("servlet")) {
			books.add("head first servlet jsp");
			
		}
		else if(topic.equals("spring")) {
			books.add("head first spring jsp");
			
		}
		else if(topic.equals("hibernate")) {
			books.add("head first hibernate jsp");
			
		}
		
		return books;
	}
}
