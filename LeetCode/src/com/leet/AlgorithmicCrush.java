package com.leet;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmicCrush {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		String response=sc.nextLine();
		String[]firstLine;
		firstLine=response.split(" ");
		int n=Integer.parseInt(firstLine[0]);
		int m=Integer.parseInt(firstLine[1]);
		//System.out.println(n+"  "+m);
		Long[] result= new Long[n];
		for (int q=0;q<n;q++)
		{
			result[q]=(long) 0;
		}
		for(int i=0;i<m;i++)
		{
			String line=sc.nextLine();
			String[] values;
			values=line.split(" ");
			long start= Long.parseLong(values[0]);
			long end= Long.parseLong(values[1]);
			long sum= Long.parseLong(values[2]);
			System.out.println(start+" "+end+" "+sum);
			
			for(long z=start-1;z<end;z++)
			{
				result[(int) z]+=sum;
			}
		}
		Long max=(long) 0;
		for (long g=0;g<result.length;g++)
		{   //System.out.println(result[(int) g]+"***");
			if(result[(int) g]>max)
			{
				max=result[(int) g];
			}
		
		}
		System.out.println(max);
		sc.close();
	}

}
