package com.revature.serv01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SerlifeCycle
 */
public class SerlifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SerlifeCycle() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("this is the init method");
    }
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	super.destroy();
    	System.out.println("this is the destroy method.");
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("this is doGet method");
		PrintWriter out = response.getWriter();        	
     	response.setContentType("text/html");
         
   String uname = request.getParameter("username");
         
		String[] topics = request.getParameterValues("subject");
         
  out.println("Thanks For Registering ");
  out.println("<h4>"+uname+"</h4>");
  out.println("Yours Topic of Interst Include");
     
    for(int i=0;i<topics.length;i++) {
			out.println(topics[i]); 
  } 
}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
