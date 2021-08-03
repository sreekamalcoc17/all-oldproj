package com.revature.employee;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Path("employeecontroller")
public class EmployeeRest {
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello() {
		return "hello";
	}

	@POST
	@Path("/loginform")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String PostForm(@FormParam("username") String username, @FormParam("password") String password) {
		//System.out.println("username was " + username + "." + "password was " + password);
		return "username was " + username + "." + "password was " + password;
		//return getEmployees(username,password);
	}
	
	@GET
	@Path("/loginresp")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployees(String username,String password) {
		ObjectMapper mapper = new ObjectMapper();
		//EmployeeDao emp = new EmployeeDaoimpl();
		ArrayList<String> lstlogin = new ArrayList<String>();
		lstlogin.add(username);
		lstlogin.add(password);
		
		try {
			return mapper.writeValueAsString(lstlogin);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			 return e.getMessage();
		}

	}
}