package com.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Zigzag {
	   static String sort_entries(String input) {

		   ArrayList<String> inputArray= new ArrayList<String>();
			 
			 String abc="b:{a:abc},c:cbd";
			 String ans[]=abc.split("[^{][a-z][}*]");

			 for (int i = 0; i < ans.length; i++) {
				System.out.println(ans[i]);
			}
			 return "";
	    

}
	 static String[] multiset_subset(String multiset) {
		 
		 ArrayList<String> inputArray= new ArrayList<String>();
		 String arr[]=multiset.split(",");
		 ArrayList<String> outputArray= new ArrayList<String>();
		 String temp=null;
		 for (int i = 0; i < arr.length; i++) {
			inputArray.add(arr[i]);
		}
		 for (int i = 0; i < arr.length; i++) {
			 temp=arr[i];
			 outputArray.add(temp);
			for (int j = i+1; j < arr.length; j++) {
				temp=temp.concat(",").concat(arr[j]);
				outputArray.add(temp);
			}
		} 
		HashSet<String> inter= new HashSet<String>();
		
		inter.addAll(outputArray);
		String out[]=inter.toArray(new String[inter.size()]);
for (int i = 0; i < out.length; i++) {
	System.out.println(out[i]);
}
		 
		 return out;

	    }

	 
	public static void main(String[] args) {
	
		//multiset_subset("apple,coconut,banana,apple");
		sort_entries("");
		
	}

}
