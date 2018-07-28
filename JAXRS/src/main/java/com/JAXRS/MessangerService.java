package com.JAXRS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.exception.DataNotFound;
import com.model.MessageModel;

public class MessangerService {
	private Map <Long, MessageModel> messages= new DatabasePlug().getMessages();

	public MessangerService()
	{
		
		messages.put((long) 10001, new MessageModel("hi again", new Date(), "chisti", 1001));
		messages.put((long) 10002, new MessageModel("hi fedfagain", new Date(), "pisti", 1002));
		
	}

	
	public List<MessageModel> getAllMessages()
	{
		return new ArrayList<MessageModel>(messages.values());
		
	}
    public MessageModel getMessage(Long key)
    {
    	return messages.get(key);
    }
    
    public MessageModel addMessage(MessageModel message){
    	
    	message.setId(messages.size()+1);
    	messages.put(message.getId(), message);
    	return message; 
    }

    public MessageModel updateMessage(MessageModel message)
    {
    	
    	messages.put(message.getId(), message);
    	return message;
    }
    
    
    public MessageModel removeMessage(long id)
    {
    	
    	return messages.remove(id);
    }
    
    
}
