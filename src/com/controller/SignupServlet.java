package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

//	public void service(HttpServletRequest request, HttpServletResponse response) {
//
//	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// user form -> parameter { param }
		System.out.println("SignupServlet::service()");

		String name = request.getParameter("name");// String
		String email = request.getParameter("email");// String
		String password = request.getParameter("password");// String

		// getParameter("Name") --> null

		System.out.println("Name => " + name);
		System.out.println("Email => " + email);
		System.out.println("Password => " + password);

		//
		// server <====> client

		response.setContentType("text/html"); // MIME TYPe

		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("Name : " + name);
		out.println("<br>Email : " + email);
		out.print("<br>Password : " + password);

		out.print("</body>");
		out.print("</html>");

	}

}
