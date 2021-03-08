package com.counterDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.*;
import javax.servlet.http.*;

import com.connection.ConnectionFactory;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.mysql.*;

public class MyServlet extends HttpServlet {
private AtomicInteger counter = new AtomicInteger(0);
   Connection connection=ConnectionFactory.getConnection();
   
	
	@Override
	public void init() throws ServletException {
		Integer val = 0;
		try {
			Statement st=(Statement) connection.createStatement();
			ResultSet rs=st.executeQuery("select * from counterDB");
			while(rs.next()) {
				val=rs.getInt("counter");
			}
			counter=new AtomicInteger(val);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter.addAndGet(1);
		PrintWriter out=response.getWriter();
		out.print(counter);
	}
	
	@Override
	public void destroy() {
		try {
			PreparedStatement pst=(PreparedStatement) connection.prepareStatement("update counterDB set counter=?");
			pst.setInt(1, counter.get());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		super.destroy();
	}


}
