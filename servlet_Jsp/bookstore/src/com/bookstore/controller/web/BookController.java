package com.bookstore.controller.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.model.dao.book.Book;
import com.bookstore.model.dao.book.BookDao;
import com.bookstore.model.dao.book.BookDaoImpl;

public class BookController extends HttpServlet {
	private BookDao dao= new BookDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("action");
	if(action.equals("showAllBooks")) {
		List<Book> books=dao.getAllBooks();
		request.setAttribute("books", books);
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}else if(action.equals("addbook")) {
		request.getRequestDispatcher("addbook.jsp").forward(request, response);
	}else if(action.equals("delbook")) {
		int id=Integer.parseInt(request.getParameter("id").trim());
		System.out.println("id in get = "+id);
		dao.delBook(id);
		response.sendRedirect("BookController.do?action=showAllBooks");	
	}else if(action.equals("updateBook")) {
		int id=Integer.parseInt(request.getParameter("id").trim());
		System.out.println("id= "+id);
		Book book=dao.getBookById(id);
		request.setAttribute("book", book);
		request.getRequestDispatcher("updateBook.jsp").forward(request, response);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id").trim());
		System.out.println("id in post = "+id);
		String isbn=req.getParameter("isbn");
		String title=req.getParameter("title");
		String author=req.getParameter("author");
		String publishDate=req.getParameter("pubDate");
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		Date pubDate=null;
		try {
			pubDate=formatter.parse(publishDate);
		}catch (Exception e) {
			// TODO: handle exception
		}
		double price=Double.parseDouble(req.getParameter("price"));
		Book book=new Book(isbn, title, author, pubDate, price);
		//System.out.println(isbn+","+title+","+author+","+pubDate+","+price);
		if(id==0) {
			dao.addBook(book);
		}else {
			dao.updateBook(id, price);
		}
		resp.sendRedirect("BookController.do?action=showAllBooks");
		
		
		
	}
	
	


}
