package com.bookstore.controller.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.model.dao.book.user.User;
import com.bookstore.model.dao.book.user.UserDao;
import com.bookstore.model.dao.book.user.UserDaoImpl;

public class UserManageController extends HttpServlet {
	private UserDao userDao=new UserDaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			request.getRequestDispatcher("adduser.jsp").forward(request, response);;
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String profile=request.getParameter("profile");
		User user=new User(username, password, profile);
		userDao.addUser(user);
		response.sendRedirect("BookController.do?action=showAllBooks&message = user added");
		
		
}
	

}
