package com.leet;

import java.util.ArrayList;

public class LongestPallindrome
{
	
	public static String longestSubString(String input)
	{
		ArrayList<String> listOfPallindromes= new ArrayList<String>();
		char[] token= input.toCharArray();
		int size=token.length;
		boolean ans=false;
		
		if(size==1)
		{
			return input;
		}
		for(int i=0;i<size;i++)
		{
			ans=checkLeftRight(i,size);	
			if(ans==true)
			{
				String eachPall=process(token[i],token,i,size);
				listOfPallindromes.add(eachPall);
				
			}
			
		}
		int length=0;
		String maxSS=null;
		for(String e:listOfPallindromes)
		{
			
			if(e.length()>length)
			{
				length=e.length();
				maxSS=e;
			}
		}
		
		return maxSS;
	}
	

	private static String process(char c, char[] token, int i, int size)
	{
		// TODO Auto-generated method stub
		int begin=i-1;
		int end=i+1;
		String ans=Character.toString(c);
		while ((begin>=-1&&end!=(size-1)))
		{
			if((token[begin]==token[end]))
			{
			ans=Character.toString(token[begin])+ans+Character.toString(token[end]);
			
			begin--;
			end++;
		
		    return ans;
			}
			else if(c==token[end])
			{
				ans=ans+Character.toString(token[end]);
				end++;	
			}
		
		
		
		}
		return ans;
	}


	private static boolean checkLeftRight(int i, int size)
	{

		if(i==(size-1))
		{
			return false;
		}
		
		return true;
	}


	public static void main(String[] args)
	{
		String ans=longestSubString("bb");
		System.out.println(ans);
	}

}
