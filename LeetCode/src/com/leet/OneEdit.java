package com.leet;

public class OneEdit {

	int response;
	
	public int checkEdit(String a, String b)
	{
		
		if(a.equals(b))
		{
			return 0;
		}
		else
		{
			if(a.length()==b.length())
			{
				response=replace(a,b);
				return response;
			}
			else if(Math.abs((a.length()-b.length()))>1)
			{
				return 2;
			}
			else
			{
				response=insertRemove(a,b);
				return response;
			}
			
		}
		
	}
	private int insertRemove(String a, String b) {

		int response=0;
		
		if(a.length()>b.length())
		{
			for (int i = 0,j=0; i < a.length()&&j<b.length(); i++,j++) {
				if(a.charAt(i)!=b.charAt(j))
				{
				  response++;
				  if(j!=(b.length()))

				  j--;
				}
			}
		}
		else
		{
			for (int i = 0,j=0; i < b.length()&&j<a.length(); i++,j++) {
				if(b.charAt(i)!=a.charAt(j))
				{
				  response++;
				  if(j!=(a.length()))

				    j--;
				}
			}
		}
		// logic for delete operation 
		
		return response;
		
	}
	
	
	
	private int replace(String a, String b) {

		int flag=0;
		 for (int i = 0; i < a.length(); i++) {
			
			 if(a.charAt(i)!=b.charAt(i))
			 {
				 flag++;
				 if(flag>1)
				 {
					 return flag;
				 }
			 }
		}
		
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneEdit oe= new OneEdit();
		int response=oe.checkEdit("pale","bake");
		System.out.println(response);
	}

}
