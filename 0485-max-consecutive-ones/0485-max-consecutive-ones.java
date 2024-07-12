class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int len=nums.length;
        int l=0,r=0,maxlen=0;
        
        while(r<len){
            if(nums[r]==0)
            {
                l=r+1;
            }
            
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}