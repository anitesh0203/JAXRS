package com.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GoldmanSachs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="acccdddddd";
		Map<Character,Integer> results= new LinkedHashMap<Character, Integer>();
		ArrayList<Integer> counts= new ArrayList<>();
		char temp=' ';
		int count=0;
		for (int i=0;i<input.length();i++)
		{
		   if(i==0)
		   {
			   results.put(input.charAt(i), count);
			  // counts.add(count);
			   temp=input.charAt(i);
			   count++;
		   }
		   else
		   {
			   if(temp==input.charAt(i))
			   {
				   count++;
				   
			   }
			   else
			   { results.put(input.charAt(i), count);

				   counts.add(count);
				   temp=input.charAt(i);
				   count=i;
			   }
		   }
		}
		counts.add(count);
System.out.println(results);
System.out.println(counts);
int finalSize=0;
int adder=0;
for(int j=0;j<counts.size();j++)
{
	if(counts.get(j)>finalSize)
	{
		finalSize=j;
		adder=counts.get(j);
	}
}
//System.out.println(finalSize);
//System.out.println(adder);
int pos= (new ArrayList<Integer>(results.values())).get(finalSize);
int endSize=pos+finalSize;
System.out.println(pos+" "+(pos+adder-1));
	}

}
