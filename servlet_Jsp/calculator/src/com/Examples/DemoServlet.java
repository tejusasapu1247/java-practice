package com.Examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("client IP: "+request.getRemoteAddr()+"<br>");
		out.print("content type: "+request.getContentType()+"<br>");
		HttpSession session=request.getSession();
		
		out.print("is session is new ? :"+session.isNew()+"<br>");
		out.print("Session ID: "+session.getId()+"<br>");
		
		
	}

}
