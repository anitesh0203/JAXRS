package com.leet;

public class Values
{
	
	public static int returnMin(int arr[])
	{
	   //find the degree 
		
		int degree=0;
		for (int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int tempdegree=0;
			for(int j=0;j<arr.length;j++)
			{
				if(temp==arr[j])
				{
					tempdegree++;
				}
			
			}
			
			if (tempdegree>degree)
			{
				degree=tempdegree;
			}
		}
		System.out.println(degree);
		// start finding the subarray
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length:j++)
			{
				
			}
		}
		
		// keep the size of the subarray
		
		
		// return minimum from the above
		
		
		
		
		
		return 0;
		
	}
	
   public static void main (String args[])
   {
	   
	   int a[]={};
	   returnMin(a);
	   
	   
	   
   }
}
