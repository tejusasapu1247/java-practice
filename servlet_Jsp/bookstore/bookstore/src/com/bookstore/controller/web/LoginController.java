package com.bookstore.controller.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.model.dao.book.exceptions.UserNotFoundException;
import com.bookstore.model.dao.book.user.User;
import com.bookstore.model.dao.book.user.UserDao;
import com.bookstore.model.dao.book.user.UserDaoImpl;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao=new UserDaoImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try {
		User user=userDao.getUser(username, password);
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("user", user);
		response.sendRedirect("BookController.do?action=showAllBooks");
		}
		catch(UserNotFoundException ex) {
			response.sendRedirect("login.jsp?message=login failed");
		}
		
		

}
}
