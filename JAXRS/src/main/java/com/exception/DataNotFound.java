package com.exception;

public class DataNotFound extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7119845237149531900L;
	public DataNotFound(String message)
	{
		super(message);
	}
}
