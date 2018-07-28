package com.leet;

import java.util.ArrayList;

public class ZeroMatrix {

	public int [][] processZero(int [][]a,int m,int n)
	{
		int trace[][]=new int[m][n];
		ArrayList<Integer>rows= new ArrayList<Integer>();
		ArrayList<Integer>cols= new ArrayList<Integer>();
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					rows.add(i);
					cols.add(j);
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				if(rows.contains((Integer)i)||cols.contains((Integer)j))
				{
					a[i][j]=0;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
					System.out.println(a[i][j]);
					
				
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,0},{2,0,1},{3,1,8}};
		ZeroMatrix zm= new ZeroMatrix();
		zm.processZero(a, 3, 3);

	}

}
