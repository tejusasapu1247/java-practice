package com.hello;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	private AtomicInteger counter = null;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("third servlet is created...");
		//read the counter
		try {
			ObjectInputStream ios=new ObjectInputStream(new FileInputStream("T:\\HCL\\servlet_Jsp\\hello\\foo.ser"));
			Integer val= (Integer) ios.readObject();
			counter=new AtomicInteger(val);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		counter.addAndGet(1);
		PrintWriter out=response.getWriter();
		out.print(counter);
	}

	@Override
	public void destroy() {
		System.out.println("third servlet is destoryed...");
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("T:\\HCL\\servlet_Jsp\\hello\\foo.ser"));
			oos.writeObject(counter.get());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
	}
	
	

}
