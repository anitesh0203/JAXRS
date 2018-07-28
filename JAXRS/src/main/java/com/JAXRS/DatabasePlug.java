package com.JAXRS;

import java.util.HashMap;
import java.util.Map;

import com.model.CommentModel;
import com.model.MessageModel;
import com.model.ProfileModel;

public class DatabasePlug {

	private static Map<Long,MessageModel> messages= new HashMap<>();
	private static Map<String,ProfileModel> profiles= new HashMap<>();
	private static Map<String,CommentModel> comments= new HashMap<>();
	
	public static Map<Long,MessageModel> getMessages()
	{
		return messages;
	}
	public static Map<String,ProfileModel> getProfiles()
	{
		return profiles;
	}
	
	public static Map<String,CommentModel> getComments()
	{
		
		return comments;
	}
}
