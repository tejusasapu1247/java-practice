package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		System.out.println("servlet1 is created...");
		
	}
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		String u=req.getParameter("user");
		String l=req.getParameter("lan");
		try {
			req.getRequestDispatcher("index1.jsp").forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("hello world!!!!!....is my fisrt servlet");
		System.out.println("service method for servlet 1 is called...");
	
	}

	@Override
	public void destroy() {
		System.out.println("servlet 1 is destoryed.......");
		
	}

	
	

}
