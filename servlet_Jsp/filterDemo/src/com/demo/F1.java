package com.demo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class F1 implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req=(HttpServletRequest) request;
		System.out.println("I am filter F1 and  I am watching you guys..");
		System.out.println(req.getRequestURI());
		chain.doFilter(request, response);
		System.out.println("I am filter 1 and you are going out ");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
