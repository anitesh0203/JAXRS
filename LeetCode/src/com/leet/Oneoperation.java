package com.leet;

public class Oneoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="pale";
		String b="aapale";
		
		int la=a.length();
		int lb=b.length();
		char[] hold=a.toCharArray();
		if(la==lb){
			for (char c : hold) {
				if(b.contains(a))
				{
					System.out.println("hello");
				}
			}
		}
		
		
	}

}
