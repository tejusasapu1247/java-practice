package com.Examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class CheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String [] languages=request.getParameterValues("options");
	if(languages!=null) {
		//List langList=
		Collection langList=(Collection) Arrays.asList(languages);
		langList.forEach(System.out::println);
	}
	}

}
