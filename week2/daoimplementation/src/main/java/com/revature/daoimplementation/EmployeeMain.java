package com.revature.daoimplementation;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://database-2.c5no6mwxlzc6.ap-south-1.rds.amazonaws.com/employee";
		
		Connection con = null;
		con = DriverManager.getConnection(url,"postgres","rsk237qq");
		

	}

}
