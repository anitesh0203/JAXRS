package com.leet;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Solution{
	static boolean isMagical(String str){
		int zeroCount=0;
		int oneCount=0;

		// num of zero
		for(int i=0;i<str.length();i++){
			if( str.charAt(i)=='0'){
				zeroCount=zeroCount+1;
			}
			else {	
				oneCount=oneCount+1;
			}
		}
		if (oneCount==zeroCount){
			//its a magical num 
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		String num ="11011000";
		int limit=1;
		ArrayList<String> nums= new  ArrayList<String>();
		ArrayList<String> numsCorrected= new  ArrayList<String>();

		for(int i=0;i<num.length();i++)
		{
			nums.add(num.substring(0, limit));
			++limit;
		}
		
		System.out.println(nums);
		for (int j=0;j<nums.size();j++)
		{
			
			boolean result= isMagical(nums.get(j));
			if(result)
			{
				numsCorrected.add(nums.get(j));
			}
		}	
	System.out.println(numsCorrected);
	}
	
	
	
	
	
}