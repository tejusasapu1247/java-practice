package com.bookstore.controller.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.model.dao.book.user.User;

public class SecFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		
		boolean isValide=false;
		HttpSession session=req.getSession(isValide);
		if(session!=null) {
			User user=(User) session.getAttribute("user");
			if(user!=null) {
				isValide=true;
			}
		}
if(isValide) {
	chain.doFilter(request, response);
}else {
	res.sendRedirect("login.jsp?messeage=login please..");
}
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
