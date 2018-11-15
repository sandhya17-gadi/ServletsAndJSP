package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo4
 */
@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
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
		String[] arr={"english","physics","maths"};
		double[] marks={87,85,95};
		
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<table border='1'>");
		
		out.print("<tr>");
		out.print("<td>"+"Subjects   "+"</td>");
		out.print("<td>"+"Marks"+"</td>");
		out.println("</tr>");
		
		double sum=0;
		double avg;
		for(int i=0;i<arr.length;i++)
		{

		out.print("<tr>");
		out.print("<td>"+arr[i]+"  "+"</td>");
		out.print("<td>"+marks[i]+"  "+"</td>");
		out.println("</tr>");
		sum=sum+marks[i];
		
		}
		avg=sum/arr.length+1;
		
		out.print("<tr>");
		out.print("<td>"+"Total  "+"</td>");
		out.print("<td>"+sum+"  "+"</td>");
		out.println("</tr>");
		
		out.print("<tr>");
		out.print("<td>"+"Average"+"</td>");
		out.print("<td>"+avg+"  "+"</td>");
		out.println("</tr>");
		
		
		
    out.println("</table>");
		
		
		
	}

}
