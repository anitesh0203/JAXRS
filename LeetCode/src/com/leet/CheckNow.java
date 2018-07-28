package com.leet;

import java.util.ArrayList;
import java.util.HashSet;

public class CheckNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="aanittesh";
		HashSet<Character> data=new HashSet<Character>();
		char[] vals=name.toCharArray();
		ArrayList<Character> list= new ArrayList<Character>();
		for(char x:vals)
		{
			data.add(x);
		}
		
		System.out.println(data);
	}

}
