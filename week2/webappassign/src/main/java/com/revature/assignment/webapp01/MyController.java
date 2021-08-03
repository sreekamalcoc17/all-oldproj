package com.revature.assignment.webapp01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("controller")
public class MyController {
	String url = "jdbc:postgresql://database-2.c5no6mwxlzc6.ap-south-1.rds.amazonaws.com/dvdrental";
	static Connection conn= null;
	
	public String mymethod(int id) {
		
			String s1 = "done";
			try {
				conn = DriverManager.getConnection(url, "postgres", "rsk237qq");
				String query1 = "select * from actor where actor_id=?";
				PreparedStatement stmt = conn.prepareStatement(query1);
				stmt.setInt(1, id);
				
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()) {
					s1=rs.getString("first_name");
				}
				
				int row = stmt.executeUpdate();
				
				if(row==0) {
					System.out.println(" not executed!");
				}else {
					System.out.println("executed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	
		return s1;
	}

	
	@POST
	@Path("/form")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String PostForm(@FormParam("id") int id){
		//String query1 = "insert into emp(name,number) values(?,?)";
		

		
        return mymethod(id);
    }
}
