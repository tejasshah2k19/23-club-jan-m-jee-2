package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ReadDataFromSessionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("name");
		String email = (String)session.getAttribute("email");
		
		System.out.println(name);
		System.out.println(email);
		
		response.sendRedirect("AddDataSession.jsp");
		
		
	}

}
