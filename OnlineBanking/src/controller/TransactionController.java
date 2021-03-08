package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Transactions;

@SuppressWarnings("serial")
@WebServlet("/fundTranser")
public class TransactionController<E> extends HttpServlet {
	int fund = 0;
	@SuppressWarnings({})
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TransactionDAO dao = new TransactionDAO();
		fund = Integer.parseInt(request.getParameter("amount"));
		try {
			Transactions transaction = new Transactions();
			transaction.setBalance(fund);
			List<Integer> res = dao.doTransaction();
			request.setAttribute("TransactionDAO", res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher disp = request.getRequestDispatcher("hello.jsp");
		disp.forward(request, response);

	}
}
