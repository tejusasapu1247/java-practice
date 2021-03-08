package com.bookstore.controller.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// code of logout, here we want pre existing session only, and then invalide it
		
		HttpSession httpSession=request.getSession(false);// hey give me pre existing session
		if(httpSession!=null) {
			httpSession.invalidate();
		}
		response.sendRedirect("login.jsp?message=logout successfully!");

	}

}
