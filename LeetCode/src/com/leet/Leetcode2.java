package com.leet;

import java.util.ArrayList;
import java.util.TreeSet;

public class Leetcode2 {

	public static void main(String[] args) {
        String temo=null;
        int size=0;
		String s="rakwmmnxengbcegiezjhfrbgneoikagdaszofomldsoiyvqcubmbsnjhuaqeayjdrktyzhjczxkasaeodqrxgdfadvgftpk";
		String real=s;
		int myLen=s.length();
		int t=0;
		TreeSet<String> bucket=new TreeSet<String>();
		while(s.length()>1)
		{
		for (int i=0;i<s.length();i++)
		{
			if(i==0)
			{
				temo=Character.toString(s.charAt(i));
			}
			else
			{
				if(temo.contains(Character.toString(s.charAt(i))))
				{
					bucket.add(temo);
					temo=null;
					temo=Character.toString(s.charAt(i));
				}
				else
				{
					temo=temo.concat(Character.toString(s.charAt(i)));

				}
			}
		}
		bucket.add(temo);
  size=0;
 String finalAns=null;
 for (String string : bucket) {
	if(string.length()>size)
	{
		size=string.length();
		finalAns=string;
		
	}
}	

s=real.substring(++t);
		}
		System.out.println(size);
	}
}