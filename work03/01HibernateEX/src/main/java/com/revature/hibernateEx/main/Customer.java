package com.revature.hibernateEx.main;

public class Customer {
	private String firstName;
	private String lastName;
	private double phno;
	private int creditScore;
	public Customer(String firstName, String lastName, double phno, int creditScore) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phno = phno;
		this.creditScore = creditScore;
	}
	public Customer() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getphno() {
		return phno;
	}
	public void setphno(double phno) {
		this.phno = phno;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	

}
