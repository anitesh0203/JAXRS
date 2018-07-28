package com.leet;

public class TryCactchpoc {

	public static void accessor ()throws Exception
	{
		System.out.println(5/1);
	}

	 public void finalize(){
	System.out.println("I will collect the data");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		accessor();
		
		}catch(Exception e)
		{
			System.out.println("exception has occured");
		}
finally{
	System.out.println("finally");
}
	}

}
