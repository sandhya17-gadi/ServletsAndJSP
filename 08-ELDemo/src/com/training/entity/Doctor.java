package com.training.entity;

public class Doctor {
	
	private String name="Dr.Adams";
	private double consultanceFee=600.00;
	private int exp=4;
	Clinic clinic=new Clinic();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getConsultanceFee() {
		return consultanceFee;
	}
	public void setConsultanceFee(double consultanceFee) {
		this.consultanceFee = consultanceFee;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Clinic getClinic() {
		return clinic;
	}
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
	
	
	
	
	
	

}
