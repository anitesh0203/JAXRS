package com.JAXRS;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.glassfish.jersey.message.internal.HttpHeaderReader;

@Path("/Annotations")
public class AnnotationDemo {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{matrix}")
	public String demo(@MatrixParam("param")String matrix,@HeaderParam("header")String header,@CookieParam("cookie")String Cookie,@Context UriInfo uriInfo,HttpHeaderReader reader)
	{
		
		
		return "matrix"+matrix+"header"+header+"cookie"+Cookie+"context uri"+uriInfo.getAbsolutePath()+"data"+reader.readNewCookie(header);
		
	}
	
}
