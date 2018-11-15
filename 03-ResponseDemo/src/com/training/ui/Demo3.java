package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo3
 */
@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
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
		List<String> playerNames=new ArrayList<String>();
		playerNames.add("Dhoni");
		playerNames.add("Kohil");
		playerNames.add("sachin");
		playerNames.add("Yuvraj");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.print("<ul>");
		for (String playerName : playerNames) {
			out.println("<li>"+playerName+"</li>");
			
		
		}
		out.println("</ul>");
		
		
		
		out.print("<ol>");
		for (String player : playerNames) {
			out.println("<li>"+player+"</li>");
			
		
		}
		out.println("</ol>");
		
		
	}

}
