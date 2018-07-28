package com.leet;


public class Braces {

	char data[];
	int top;
	 static String[] braces(String[] values) {
		 
		 int iteration=Integer.parseInt(values[0]);
		 String [] ans=new String[iteration];
		 for (int i = 1,j=0; i <= iteration; i++,j++) {
			
			 ans[j]=checkBraces(values[i]);
		}
		 
		 System.out.println(ans[0]+" "+ans[1]);
		return ans;


	    }

	
	public  static String checkBraces(String string) {
		
		boolean opening=false,closing= false;
		
		char data[]=new char[string.length()];
		int j=0, top=-1;
		for(int i=0;i<string.length();i++)
			
		{
			// if the read string is opening
			
			if(string.charAt(i)=='{'||string.charAt(i)=='('||string.charAt(i)=='[')
			{
				opening=true;
				data[j]=string.charAt(i);
				j++;
				top++;
			}
			
			
			// if the read is closing
			
			
			if(string.charAt(i)=='}'||string.charAt(i)==')'||string.charAt(i)==']')
			{
				closing=true;
				boolean ans= checkBalance(data,top,string.charAt(i));
				if(ans==false)
				{
				return "NO";
				}
				else
				{
					j--;
					return "YES";
				}
			}
			
			
		}
	return "TRUE";	
	}


	


	private static boolean checkBalance(char[] data, int top, char charAt) {

		if(charAt=='}'){
		if(data[top]=='{')
		{   
			top--;
			return true;
		}
		}
		else if(charAt==']')
		{
			if(data[top]=='[')
			{			top--;

				return true;
			}
		}
		else if (charAt==')')
		{
			if(data[top]=='(')
			{			top--;

				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str[]={"2","{()}","{[}]"};
	
	braces(str);
	
	
	}

}
