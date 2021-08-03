package com.revature.demo.jdbcEmployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String url = "jdbc:postgresql://database-2.c5no6mwxlzc6.ap-south-1.rds.amazonaws.com/employee";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,"postgres","rsk237qq");
			
			System.out.println("ENTER FROM THE OPTIONS BELOW:\n 1:Create \n 2:Read \n 3:Update \n 4:Delete \n enter your option: ");
			int n = scan.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter first Name: ");
				String firstName = scan.next();
				System.out.println("Enter Second Name: ");
				String lastName = scan.next();
				System.out.println("Enter Salary: ");
				double salary01 = scan.nextDouble();
				String query01 = "insert into employees(first_name,last_name,salary) values(?,?,?)";
				PreparedStatement stmt = con.prepareStatement(query01);
				stmt.setString(1,firstName);
				stmt.setString(2, lastName);
				stmt.setDouble(3,salary01);
				
				if (stmt.execute()) {
					System.out.println("failed!!");
				} else {
					System.out.println("done!");
				}
				//System.out.println("done!");
				stmt.close();
				con.close();
				break;
			case 2:
				String query02 = "select * from employees";
				PreparedStatement stmt1 = con.prepareStatement(query02);
				ResultSet rs = stmt1.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
				
				stmt1.close();
				con.close();
				break;
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
