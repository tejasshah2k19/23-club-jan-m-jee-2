package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//1 class implements Filter 
//2 interface -> override -> logic 
//3 filter mapping -> web.xml 

public class LoginFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("LoginFilter :: doFilter() ");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;
		if (email == null || email.trim().length() == 0) {
			request.setAttribute("emailError", "Please Enter Email");
			isError = true;
		}
		if (password == null || password.trim().length() == 0) {
			request.setAttribute("passwordError", "Please Enter Password");
			isError = true;
		}

		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("FilterLogin.jsp");
			rd.forward(request, response);
		}else {
			//goAhead 
			//servlet 
			//LoginFilter  -> empty? 
			//LoginRegExFilter -> email pattern ? password strong ?
			//LoginServlet 
			chain.doFilter(request, response); // next filter ? or servlet? 
		}

	}

	public void destroy() {

	}
}
