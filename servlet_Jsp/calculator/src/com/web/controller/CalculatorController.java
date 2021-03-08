package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.model.Calculator;

public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer x=Integer.parseInt(request.getParameter("x"));
		Integer y=Integer.parseInt(request.getParameter("y"));
		
		//controller must get processing done with the help 
		//of model layer..
		
		Integer sum=Calculator.add(x,y);
		System.out.println("again method is called..");
		
//		PrintWriter out=response.getWriter();
//		out.print(sum);
//		out.print("done....");
		
		//controller should print the processing using result,jsp(view layer)
			
//		request.setAttribute("sum", sum);
//		response.sendRedirect("result.jsp");
		HttpSession session=request.getSession();
		session.setAttribute("sum", "result.jsp");
		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
