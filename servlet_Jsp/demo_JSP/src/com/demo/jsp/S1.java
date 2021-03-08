package com.demo.jsp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dog dog=new Dog();
		dog.setName("puppy");
		
		Person person=new Person();
		person.setName("hema");
		person.setDog(dog);
		request.setAttribute("person", person);
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
		
		//		List<String> customers=Arrays.asList("teju","moksha","harsha");
//		request.setAttribute("customers", customers);
//		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
//		rd.forward(request, response);
//		
		
	}

}
