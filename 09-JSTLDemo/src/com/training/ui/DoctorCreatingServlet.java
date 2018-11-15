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

import com.training.entity.Doctor;

/**
 * Servlet implementation class DoctorCreatingServlet
 */
@WebServlet("/DoctorCreatingServlet")
public class DoctorCreatingServlet extends HttpServlet {
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
		Doctor d=new Doctor();
		d.setId(1);
		d.setName("Sandhya");
		d.setFee(8676);
		d.setQualification("M.B.B.S");
		d.setExp(15);
		d.setGender("Female");
		
		request.setAttribute("DOC", d);
		
		Doctor d1=new Doctor();
		Doctor d2=new Doctor();
		Doctor d3=new Doctor();
		Doctor d4=new Doctor();
		
		
		
		d1.setId(11);
		d1.setName("Sand");
		d1.setFee(5676);
		d1.setQualification("M.B.B.S");
		d1.setExp(5);
		d1.setGender("Male");
		
		d2.setId(12);
		d2.setName("Sandyyy");
		d2.setFee(867);
		d2.setQualification("M.B.B.S");
		d2.setExp(5);
		d2.setGender("Female");
		
		d3.setId(15);
		d3.setName("Sanjuu");
		d3.setFee(876);
		d3.setQualification("M.B.B.S");
		d3.setExp(8);
		d3.setGender("Male");
		
		d4.setId(12);
		d4.setName("Samyuu");
		d4.setFee(476);
		d4.setQualification("M.B.B.S");
		d4.setExp(7);
		d4.setGender("Female");
		
		List<Doctor> doctors=new ArrayList<Doctor>();
		
		doctors.add(d);
		doctors.add(d1);
		doctors.add(d2);
		doctors.add(d3);
		doctors.add(d4);
		
		request.setAttribute("DOCTORS", doctors);
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("Display4.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
