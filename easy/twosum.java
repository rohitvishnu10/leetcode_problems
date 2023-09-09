class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c =0 ;
        
        while(c<nums.length)
        {
             for(int i=c+1;i<nums.length;i++)
          {
            if((nums[c]+nums[i])==target)
            {
              return new int[] {c,i};
               
            }
            
          }
          c+=1;
        }
        
       
        return new int[]{};
    }
}

    
