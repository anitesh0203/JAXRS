package com.leet;

import java.util.ArrayList;

public class pallindrome {
	
	public static String Squeezer(String data)
	{
		char line[]=data.toCharArray();
		String atta;
        //char trimmedLine[] = null;	
		String ans = "";
        ArrayList<Character> trimmedLine= new ArrayList<Character>();
        int j=0;
		for(int i=0;i<line.length;i++)
		{
			if((line[i]>=65&&line[i]<=90)||(line[i]>=97&&line[i]<=122)||(line[i]>=48&&line[i]<=57))
			{
				trimmedLine.add(line[i]);
				ans=ans.concat(Character.toString(line[i]));
				//j++;
			}
		}
		
		atta=trimmedLine.toString();
		
		System.out.println(ans);
return ans;
	}

   public static boolean checkPall(String line)
   {
      String ans=Squeezer(line.toLowerCase());
      int i=0,j=ans.length()-1;
      while((i-j!=0)&&(i-j!=1))
      {
    	  if(ans.charAt(i)!=ans.charAt(j))
    	  {
    		  return false;
    	  }
    	  i++;
    	  j--;
      }
	   
	   return true;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkPall("0P"));

	}

}
