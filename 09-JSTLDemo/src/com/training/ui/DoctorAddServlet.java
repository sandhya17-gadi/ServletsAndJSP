package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.entity.Doctor;

/**
 * Servlet implementation class DoctorAddServlet
 */
@WebServlet("/DoctorAddServlet")
public class DoctorAddServlet extends HttpServlet {
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
		
		int id=Integer.parseInt(request.getParameter("txt1"));
		String name=request.getParameter("txt2");
		String qual=request.getParameter("txt3");
		double fee=Double.parseDouble(request.getParameter("txt4"));
		String gen=request.getParameter("txt5");
		int exp=Integer.parseInt(request.getParameter("txt6"));
		
		Doctor d=new Doctor();
		d.setId(101);
		d.setName("Rahul");
		d.setGender("Female");
		d.setExp(12);
		d.setFee(1200);
		d.setQualification("M.B.B.S");
		
		
		HttpSession session=request.getSession(true);
		
		List<Doctor> doctors=null;
		
		doctors=(List<Doctor>) session.getAttribute("DOCTORS");
		
		if(doctors==null)
		{
		   doctors=new ArrayList<Doctor>();
		   session.setAttribute("DOCTORS",doctors);
		}
		
		doctors.add(d);
		RequestDispatcher dispatcher=request.getRequestDispatcher("Display4.jsp");
		dispatcher.forward(request, response);
		
	}

}
