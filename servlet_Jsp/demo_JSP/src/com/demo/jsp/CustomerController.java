package com.demo.jsp;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer customer1=new Customer(1, "teju", "a", "dr", "23431313", new Date(), 12);
		Customer customer2=new Customer(2, "teju", "a", "dr", "23431313", new Date(), 12);
		Customer customer3=new Customer(3, "teju", "a", "dr", "23431313", new Date(), 12);
		Customer customer4=new Customer(4, "teju", "a", "dr", "23431313", new Date(), 12);
		Customer customer5=new Customer(5, "teju", "a", "dr", "23431313", new Date(), 12);
		List<Customer> customers=Arrays.asList(customer1,customer2,customer3,customer4,customer5);
		request.setAttribute("customers", customers);
		RequestDispatcher rd=request.getRequestDispatcher("showCustomers.jsp");
		rd.forward(request, response);
	
	}

}
