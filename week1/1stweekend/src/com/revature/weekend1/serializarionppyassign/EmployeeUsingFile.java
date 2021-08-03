package com.revature.weekend1.serializarionppyassign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class EmployeeUsingFile extends Exception {
	private int EmployeeId;
	private String firstName;
	private String lastName;
	private String role;
	private String fil = "";
	
	
/*
	public EmployeeUsingFile(int employeeId, String firstName, String lastName, String role) {
		super();
		EmployeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}*/

	public void employeeFile() throws IOException {
		FileInputStream in = new FileInputStream("emp.txt");
		// int s = in.read();
		try {
			// FileInputStream in = new FileInputStream("emp.txt");
			int i = 0;
			while ((i = in.read()) != -1) {
				fil += (char) i;
			}
			// System.out.println(fil);
		} finally {
			in.close();
		}
	}

	public static void main(String[] args) throws IOException {
		EmployeeUsingFile m = new EmployeeUsingFile();
		m.employeeFile();
		System.out.println(m.fil);
		ArrayList arr = new ArrayList();
		StringTokenizer tok = new StringTokenizer(m.fil, ":");
		while (tok.hasMoreTokens()) {
			arr.add(tok.nextToken());
			
		}
		

	}

}
