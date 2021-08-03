package com.revature.empServ;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Emp02 extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = "jdbc:postgresql://database-2.c5no6mwxlzc6.ap-south-1.rds.amazonaws.com/employee";
		int i = (int)req.getAttribute("id");
		Connection con = null;
		PrintWriter out = resp.getWriter();

		try {
			
			Class.forName("org.postgresql.Driver");
		
			con = DriverManager.getConnection(url,"postgres","rsk237qq");
			String query01 = "select * from empserv where id = ?";
			PreparedStatement stmt = con.prepareStatement(query01);
			stmt.setInt(1, i);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				out.print(rs.getInt("id")+": "+rs.getString("name"));
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}	
}
