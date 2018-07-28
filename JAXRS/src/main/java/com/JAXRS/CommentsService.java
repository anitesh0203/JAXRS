package com.JAXRS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.model.CommentModel;

public class CommentsService {
	Map<String,CommentModel> comments= new DatabasePlug().getComments();
	
	public CommentsService()
	{
		comments.put("c1", new CommentModel("101", "Nice picture"));
		comments.put("c2", new CommentModel("102", "Nice backround"));
	}
 
	public List<CommentModel> getComments()
	{
		return new ArrayList<CommentModel>(comments.values());
	}
	
	public CommentModel getComment(String id)
	{
		return comments.get(id);
	}
}
