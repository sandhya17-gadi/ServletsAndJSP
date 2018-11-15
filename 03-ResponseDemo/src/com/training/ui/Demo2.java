package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo2
 */
@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int rollno=5001;
		String name="Ram";
		String city="Chennai";
		response.setContentType("text/xml");
		PrintWriter out=response.getWriter();
		out.println("<student>");
		out.println("<Name>" +name+"</Name>");
		out.println("<Rollno>" +rollno+"</Rollno>");
		out.println("<City>" +city+"</City>");
		out.println("</student>");
		
		
		
		
	}

}
