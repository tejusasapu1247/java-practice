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

public class ClearCacheFilter implements Filter {
public void init(FilterConfig fConfig) throws ServletException {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		res.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //HTTP 1.1
		res.addHeader("Cache-Control", "post-check=0,pre-chcek=0");
		res.setHeader("Pragma","no-cache"); //HTTP 1.0
		res.setDateHeader ("Expires", 0);
		chain.doFilter(request, response);
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
