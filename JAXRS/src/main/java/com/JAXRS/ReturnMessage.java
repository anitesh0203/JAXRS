package com.JAXRS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.exception.DataNotFound;
import com.model.ErrorModel;
import com.model.MessageModel;
@Path("/messagesList")
public class ReturnMessage {
	MessangerService msg= new MessangerService();
	
	
@GET 
@Produces(MediaType.APPLICATION_JSON)

	public List<MessageModel> returnMessageModel()
	{
		return msg.getAllMessages();
		
	
	}
    @GET
    @Path("/{seriel}")
    @Produces(MediaType.APPLICATION_JSON)

    public MessageModel getMessage(@PathParam("seriel") long key)
    {
    	Response response= Response.status(Status.NOT_FOUND).entity(new ErrorModel("101","error hai")).build();
       MessageModel messageModel= msg.getMessage(key);
       if (messageModel.equals(null))
    	   throw new WebApplicationException(response);
       else return messageModel ;
    	
    }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public MessageModel saveData(MessageModel message)
  {
	  
	  
	  return msg.addMessage(message);
	  
	  
  }
    

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public MessageModel updateData(MessageModel message)
  {
	  return msg.updateMessage(message);
  }
  
  
  @Path("/{seriel}")
  @DELETE
  @Produces(MediaType.APPLICATION_JSON)
  public MessageModel deleteData(@PathParam("seriel")long id)
  {
	  return msg.removeMessage(id);
  }

 
 @Path("/{messageId}/comments")
 public ReturnComment redirectComment()
 {
	return new ReturnComment();
 }
  
  
}
