class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first=-1,last=-1;
        
        int sum[]={-1,-1};
        int len=nums.length;
        int countL=0;
        int countR=0;
        for(int i=0;i<len;i++){
            if(nums[i]==target)
            {
                countL++;
                first=i;
                break;
            }
        }

        for(int j=len-1;j>=0;j--){
            if(nums[j]==target)
            {
                countR++;
                last=j;
                break;
            }
        } 

    if(countR>0 && countL>0){
        return new int[]{first,last};
    }    
    else {
        return sum;
    }
}
}