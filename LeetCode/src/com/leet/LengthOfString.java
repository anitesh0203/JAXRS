package com.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionListener;

public class LengthOfString {

	public static void main(String[] args) {
    
		String abc="tactcoa";
		int orgSize=abc.length();
		TreeSet<Character> holder= new TreeSet<Character>();
		for (Character character : abc.toCharArray()) {
			holder.add(character);
			
		}
		int finalLength=holder.size();
		
		if(orgSize%2==0)
		{
		
		System.out.println((orgSize/2)==finalLength);
		}
		else
		{
			System.out.println(((orgSize-1)/2)==(finalLength-1));
		}
	}
	

}
