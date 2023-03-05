package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SaveDataSesssionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String key = request.getParameter("key");// name
		String val = request.getParameter("value");// royal

		// ret. current session
		HttpSession session = request.getSession();
		session.setAttribute(key, val);// name,royal

		session.setMaxInactiveInterval(1000 * 60 * 3);
		response.sendRedirect("AddDataSession.jsp");

	}

}
