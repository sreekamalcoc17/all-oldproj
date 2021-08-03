package com.revature.demo.jdbcEmployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://database-2.c5no6mwxlzc6.ap-south-1.rds.amazonaws.com/employee";
		
		Connection con = null;
		
		try {
			
			con = DriverManager.getConnection(url,"postgres", "rsk237qq");
			
			String name = "a%";
			String query01 = "select * from employees where first_name like ?";
			PreparedStatement stmt = con.prepareStatement(query01);
			stmt.setString(1, name);
			ResultSet rs =  stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
