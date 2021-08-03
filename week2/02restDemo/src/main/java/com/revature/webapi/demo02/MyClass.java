package com.revature.webapi.demo02;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mycls")
public class MyClass {
	
	@GET
	@Path("/trainer")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTrainer() {
        return "Hello From Jas!";
    }
	
	@GET
	@Path("/students")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudent() {
        return "Hi From associates!";
    }
    

}
