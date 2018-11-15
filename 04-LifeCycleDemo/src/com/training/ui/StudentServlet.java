package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet(
		urlPatterns = { "/StudentServlet" }, 
		initParams = { 
				@WebInitParam(name = "i_rollNo", value = "105"), 
				@WebInitParam(name = "i_Name", value = "sandhya"), 
				@WebInitParam(name = "i_Age", value = "22")
		})
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int rollNo;
	private String name;
	private int age;

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
		PrintWriter out=response.getWriter();
		out.println(this.rollNo+"<br>"+this.name+"<br>"+this.age);
	}
	
	@Override
	public void init() throws ServletException {
		ServletConfig config=getServletConfig();
		String strRoll=config.getInitParameter("i_rollNo");
		String name=config.getInitParameter("i_Name");
		String age=config.getInitParameter("i_Age");
		this.rollNo=Integer.parseInt(strRoll);
		this.name=name;
		this.age=Integer.parseInt(age);
		
	}

}
