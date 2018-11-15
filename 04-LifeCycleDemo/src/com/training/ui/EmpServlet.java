package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	private int id;
    private String name;
	private double salary;
	

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
		System.out.println("\n\n\t\t"+new Date());
		System.out.println(this.add(10, 25));
		PrintWriter out=response.getWriter();
		out.println(this.id+"<br>"+this.name+"<br>"+this.salary);
		
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init is called");
		this.id=25;
		this.name="sandhya";
		this.salary=20000.00;
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("\n\n\t\tdestroy message");
	}

}
