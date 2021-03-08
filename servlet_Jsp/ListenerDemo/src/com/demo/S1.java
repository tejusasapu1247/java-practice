package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Dog dog=new Dog("puppy");
//		Person person=new Person();
//		person.setPname("ramu");
//		person.setDog(dog);
		String[] footballTeams = { "Liverpool", "Manchester Utd", "Arsenal", "Chelsea" };

		request.setAttribute("footballList", footballTeams); 
		
		
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
