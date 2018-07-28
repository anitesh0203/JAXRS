package com.JAXRS;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.model.CommentModel;
@Path("/")

public class ReturnComment {

@GET
	public List<CommentModel> returnComments()
	{
		return new CommentsService().getComments();
	}

@GET
@Path("/{commentId}")
public CommentModel returnComment(@PathParam("commentId") String commentId)
{
	return new CommentsService().getComment(commentId);
}

}
