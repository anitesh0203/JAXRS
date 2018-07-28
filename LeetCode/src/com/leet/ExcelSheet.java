/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int check(int n) {
        int version=1;
        while(version<=n)
        {
            if(isBadVersion(version))
            {
                return version;
            }
            version++;
        }
        
        return version;
    }




	 public int firstBadVersion(int n) {
	   
			int start=1;
			int end=n;
			int mid=(start+end)/2;
			
			while (start<=end)
			{
			  if(isBadVersion(mid))
				 {
					end=mid;
					mid=(start+mid)/2;
				    int v=1;
                          while(v<=n)
                          {
                           if(isBadVersion(v))
                              {
                                  return v;
                              }   
                            v++;
                          }
        
                          return v;
                       }
                
                else
				{
					start=mid+1;
					mid=(start+end)/2;
   					     int v=1;
                          while(v<=n)
                          {
                           if(isBadVersion(v))
                              {
                                  return v;
                              }   
                            v++;
                          }
        
                          return v;
                    
				}


                
				}
				
			}
			
}
			
		