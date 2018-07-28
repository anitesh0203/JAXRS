package com.JAXRS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fruits")
public class ReturnFruits {

	public ReturnFruits() {

	System.out.println("welcome");
	}

	FruitService fruitServices= new FruitService();
	
	@GET
	@Path("/{fruitName}")

	@Produces(MediaType.APPLICATION_JSON)
	
	public Fruit returnFruit(@PathParam("fruitName") String fruitName)
	{
		System.out.println("hello");
		System.out.println(fruitServices.getFruitsList().get(fruitName).name);
		return fruitServices.getFruitsList().get(fruitName);
	}
	
}
