package ckom.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoSession extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("html/text");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		out.print("is it a new session ?"+session.isNew()+"<br>");
		out.print("session id"+session.getId()+"<br>");
		out.print("creation tym :"+session.getCreationTime()+"<br>");
		out.print("last access time : "+session.getLastAccessedTime()+"<br>");
		out.print("Max inactive interval :"+session.getMaxInactiveInterval()+"<br>");
		out.print("hash code of session :"+session.hashCode()+"<br>");
		
		Integer counter=(Integer) session.getAttribute("counter");
		if(counter==null) {
			out.print("welcome user....keep visiting");
			session.setAttribute("counter", 1);
		}else {
			out.print("Hiii user..you have visited "+counter+"..keep visiting");
			counter++;
			session.setAttribute("counter", counter);
		}
	
	
	}

	
}
