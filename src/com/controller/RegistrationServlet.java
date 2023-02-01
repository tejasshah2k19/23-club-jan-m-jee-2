package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		//validation 
		
		//db store 
		
		
		//error? no 
				//login 
		//Registration 
		
		//PrintInfo.jsp
		
		request.setAttribute("firstName", firstName);
		request.setAttribute("email", email);
		request.setAttribute("password", password);
		
		RequestDispatcher rd = request.getRequestDispatcher("PrintInfo.jsp");
		rd.forward(request, response);
	}
}
