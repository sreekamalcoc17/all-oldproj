package com.revature.servletpractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServ extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		
		int k = (int) req.getAttribute("abc");
		
		PrintWriter out = resp.getWriter();
		out.println("hey this is sq :"+ k);
		
	}
}
