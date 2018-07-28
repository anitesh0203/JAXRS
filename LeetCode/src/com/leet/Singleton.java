package com.leet;

public class Singleton {

	private static Singleton singleton= new Singleton();
	
	private static Singleton returnObject()
	{
		return singleton;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton single=returnObject();
		
	}

}
