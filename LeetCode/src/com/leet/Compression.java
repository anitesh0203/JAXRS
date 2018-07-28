package com.leet;

public class Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abahhhhhhhhhh"; //a2b1c3a1j3
		char temp=' ';
		int ctr=1;
		String ans=null;
        for (Character c : input.toCharArray()) {
        	if(temp==' ')
        	{
        		ans=c.toString();
        		temp=c;
        	}
        	else
        	{
        		if(temp==c){
        			ctr++;
        		}
        		else{
        			ans=ans.concat(Integer.toString(ctr));
        			ans=ans.concat(c.toString());
        			
        			ctr=1;
        			temp=c;
        		}
        	}
        	
		}
        
        ans=ans.concat(Integer.toString(ctr));
		
        System.out.println(ans);
	}

}
