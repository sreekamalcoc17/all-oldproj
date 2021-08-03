package com.revature.empServ;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Emp01
 */
public class Emp01 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
	
	String url = "jdbc:postgresql://database-2.c5no6mwxlzc6.ap-south-1.rds.amazonaws.com/employee";
	
	Connection con = null;

    /**
     * Default constructor. 
     */
    public Emp01() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(req.getParameter("username"));
		String j = req.getParameter("name");
		System.out.println(i+" "+j);
		
		
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,"postgres","rsk237qq");
			String query01 = "insert into empserv(id,name) values(?,?)";
			PreparedStatement stmt = con.prepareStatement(query01);
			stmt.setInt(1,i);
			stmt.setString(2, j);
			stmt.execute();
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("id", i);
		RequestDispatcher rd = req.getRequestDispatcher("emp2");
		rd.forward(req, resp);


	}
}
