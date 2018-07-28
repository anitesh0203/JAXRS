package com.leet;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String lineOne=sc.nextLine();
		String params[]=(lineOne.split(" "));
		int n=Integer.parseInt(params[0]);
		int m=Integer.parseInt(params[1]);
		
		Integer [] index=new Integer[n];
		String [] finalResult=new String[n];
		
		String lineTwo=sc.nextLine();
		String nos[]=(lineTwo.split(" "));
		for(int i=0;i<n;i++)
		{
			int temp=i+m;
			if(temp>m)
			{
				temp=temp-(m+1);
			}
			index[i]=temp;
		}
		int hold;
	for(int x=0;x<n;x++)
	{
		finalResult[x]=nos[index[x]];
	}
	
	for (String sep:finalResult)
		System.out.print(sep+" ");
	}

}
