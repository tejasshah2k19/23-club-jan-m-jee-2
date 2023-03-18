package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

 		
		//authentication 
		if (email.equals("admin@gmail.com") && password.equals("12345678")) {
			// correct
			response.sendRedirect("FilterHome.jsp");
		} else {
			response.sendRedirect("FilterLogin.jsp");
		}
	}

}
