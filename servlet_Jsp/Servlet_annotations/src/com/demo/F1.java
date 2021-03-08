package com.demo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns= {"*.do"})
public class F1 implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Hello I am filter 1");
		HttpServletRequest req=(HttpServletRequest) request;
		System.out.println(req.getRequestURI());
		chain.doFilter(request, response);

	}

	public void destroy() {
		
	}
}
