package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DataServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//set data and send it to jsp 
		
		//servlet --> jsp --> send data 
		Date d  = new Date();//
		request.setAttribute("currentDateTime", d);
	
		HttpSession session = request.getSession();
		session.setAttribute("name", "Royal");
		request.setAttribute("name","Edu");
		request.setAttribute("age", 30);
		request.setAttribute("salary", 50000);
		
		ArrayList<String> list  = new ArrayList<String>();
		
		list.add("ram");
		list.add("shyam");
		list.add("GanShyam");
		list.add("ravan");
		request.setAttribute("list", list);
		
		//open jsp 
		RequestDispatcher rd = request.getRequestDispatcher("PrintData.jsp");
		rd.forward(request, response);
	}

}
