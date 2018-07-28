package com.JAXRS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class Mesaages {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public String returnMessage()
	{
		
		return "Hello world !";
	}
}
