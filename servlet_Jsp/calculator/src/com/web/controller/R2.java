package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class R2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=(String)request.getAttribute("name");
		//RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
//		rd.forward(request, response);
		
		PrintWriter out=response.getWriter();
		out.print(name+"<br>");
		out.print("In servlet R2"+"<br>");

	}

}
