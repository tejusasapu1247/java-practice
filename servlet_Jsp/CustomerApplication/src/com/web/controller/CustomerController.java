package com.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Customer;
import com.model.CustomerDao;
import com.model.CustomerDaoImpl;

public class CustomerController extends HttpServlet {
	private CustomerDao dao=new CustomerDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> customers=dao.getAllCustomers();
		request.setAttribute("list",customers);
		RequestDispatcher rd=request.getRequestDispatcher("showCustomer.jsp");
		rd.forward(request, response);
//		String action=request.getParameter("action");
//		if(action.equals("showCustome"))
	}

}
