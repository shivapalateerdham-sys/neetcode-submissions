class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int k = 0;
        int i=0;
        int j = nums.length -1;

       while(i<j)
       {
        if(nums[i]!=val)
        {
            i++;
        }
        else if(nums[j]==val)
        {
            j--;
        }
        else
        {
           int temp=nums[i];
           nums[i]=nums[j];
           nums[j]= temp;
           i++;
           j--; 
        }
       }
        for ( i=0;i<nums.length;i++)
        {
            if(nums[i]!= val)
            {
                k++;
            }
        }
        return k;
        
    }
}