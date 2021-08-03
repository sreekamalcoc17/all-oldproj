package com.revature.demo.jdbcEmployee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBC {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://database-2.c5no6mwxlzc6.ap-south-1.rds.amazonaws.com/employee";
		Connection conn = null;

		try {
			//this is not nessasary in java1.7 and above.
			//Class.forName("org.postgresql.Driver");
			
			//open a connection
			conn = DriverManager.getConnection(url, "postgres", "rsk237qq");
			
			
			//create a statement
			Statement stmt = conn.createStatement();
			String queryFirstName = "select * from employees";
			ResultSet rs = stmt.executeQuery(queryFirstName);
			
			
			//process the result
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("first_name")+" "+rs.getString(3)+" "+rs.getString(4));
			}
			
			stmt.close();
			
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
