package ServetDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Login extends HttpServlet{
       public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	   PrintWriter out=res.getWriter();
    	   res.setContentType("text/html");
    	   String User=req.getParameter("user");
    	   String password=req.getParameter("pwd");
    	   if(User.equals("teju") && password.equals("moksha")){
    		   out.println("login is successful...");
    	   }
    	   else {
    		   out.println("Enter valid credentials...");
    	   }
       }
}
