package com.leet;

public class First {
    public int[] twoSum(int[] nums, int target) {
        
     	
    	for(int i=0;i<nums.length-1;i++)
    	{
    		for(int j=0;j<nums.length;j++)
    		{
    			if(nums[i]+nums[j]==target&&i!=j)
    			{
    				int reply[]={i,j};
    				System.out.println(i+" "+j);
    				return reply;
    			}
    		}
    	}

return null;
}

	public static void main(String[] args) {
               First first= new First();
               int nums[]={2,5,5,11};
               System.out.println(first.twoSum(nums, 10));
		 
		}
	}


