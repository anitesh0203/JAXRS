package com.leet;

public class AncestryDNA {
 int startYear,endyear;
 String flag;
 public AncestryDNA() {
	this.startYear = 0;
	this.endyear = 0;
	this.flag=null;
}
public void include(int start, int end)
 {
	 if(this.startYear==0&&this.endyear==0)
	 {
		 this.flag="i";
		 this.startYear=start;
		 this.endyear=end;
		 
	 }
	 else
	 {
		if(this.flag.equals("i"))
		{
			if(this.startYear>start)
			{
				this.startYear=start;
			}
			if(this.endyear<end)
			{
				this.endyear=end;
			}
		}
		else
		{
			
		}
	 }
 }
 public void exclude(int start, int end)
 {
	 if(this.startYear==0&&this.endyear==0)
	 {
		 this.flag="e";
		 this.startYear=start;
		 this.endyear=end;
		  
	 }
	 else
	 {
			if(this.flag.equals("e"))
			{
				if(this.startYear>start)
				{
					this.startYear=start;
				}
				if(this.endyear<end)
				{
					this.endyear=end;
				}
			}
			else
			{
				
			}
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AncestryDNA  ancestryDNA= new AncestryDNA();
     
     
		
	}

}
