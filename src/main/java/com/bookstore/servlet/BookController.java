package com.bookstore.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookurl")
public class BookController extends HttpServlet
{
	String action;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		action = req.getParameter("action");
		
		if(action!=null && action.equals("list"))
		{
			// here we write logic to show book-list 
			resp.sendRedirect("booklist.jsp");
		}
		
	}
}
