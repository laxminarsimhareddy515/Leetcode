// class Solution {
//     public int maxSubArray(int[] nums) {

//         int len = nums.length;
//         int maxsum=Integer.MIN_VALUE;

//         for(int sub=1;sub<=len;sub++){
//             int wsum=0, end=0;
//             while(end<sub)
//             {
//                 wsum += nums[end++];
//             }
//             maxsum = Math.max(maxsum,wsum);
//             for(end=sub;end<len;end++){
//                 wsum += nums[end] - nums[end-sub];
//                 maxsum = Math.max(maxsum,wsum);

//             }
//         }

//        return maxsum; 
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}