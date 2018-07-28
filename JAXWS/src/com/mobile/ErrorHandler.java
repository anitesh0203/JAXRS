package com.mobile;

public class ErrorHandler extends Exception {

	public void exceptionHandler(String trace)
	{
		System.out.println("Error has occured"+trace);
	}
}
