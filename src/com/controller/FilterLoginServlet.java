package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterLoginServlet extends HttpServlet {

	String cEmail, cPassword;

// 	public void init(ServletConfig config) throws ServletException {
// 
//		cEmail = config.getInitParameter("email");
//		cPassword = config.getInitParameter("password");
//	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		cEmail = config.getInitParameter("email");
		cPassword = config.getInitParameter("password");

		ServletContext context = getServletContext();
		
		String adminName = context.getInitParameter("adminName");
		//
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// authentication
		if (email.equals(cEmail) && password.equals(cPassword)) {
			// correct
			response.sendRedirect("FilterHome.jsp");
		} else {
			response.sendRedirect("FilterLogin.jsp");
		}
	}

}
