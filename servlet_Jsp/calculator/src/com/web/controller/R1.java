package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class R1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("In servlet R1"+"<br>");
		request.setAttribute("name", "teju");
		RequestDispatcher rd=request.getRequestDispatcher("R2");
		rd.forward(request, response);
		out.print("Returned back to R1"+"br>");
	}

}
