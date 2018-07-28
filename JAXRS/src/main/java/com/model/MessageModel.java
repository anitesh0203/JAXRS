package com.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class MessageModel {

	public MessageModel()
	{
		
	}
	

	public MessageModel(String message, Date date, String author, long id) {
		super();
		this.message = message;
		this.date = date;
		this.author = author;
		this.id = id;
	}


	String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	Date date;
	String author;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	long id;
	
	
	
}
