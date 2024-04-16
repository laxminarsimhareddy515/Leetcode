import java.util.ArrayList;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
                 a=i;
                break;
            }
            if(nums[nums.length-1]<target)
            {
                a=nums.length;
                break;
            }
            
            
        }
       return a; 
    }
}