class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1000000007;
        int result = 0;
        int len = nums.length;
        int power[]=new int[len];
        power[0]=1;

    for (int i=1; i<len;i++){
        power[i] = (power[i-1]*2) % mod;
    }
    
    int left = 0, right = len-1;
    while(left<=right){
        if(nums[left]+nums[right] <= target){
            result += power[right-left];
            result %= mod;
            left++;
        }
        else{
            right--;
        }
    }
    return result;
    }
}
