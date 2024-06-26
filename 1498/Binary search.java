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
    
    for(int left=0; left<len; left++)
    {
        int right = BinarySearch(nums, target-nums[left])-1;
        if(right>=left)
        {
            result += power[right-left];
            result %= mod;
        }
    }
    return result;
    }
  
    private int BinarySearch(int nums[],int value)
    {
        int left=0, right= nums.length-1;
        while(right>=left){
            int mid = left+(right-left)/2;

            if(nums[mid]<=value)
                left=mid+1;
            else 
                right=mid-1;
        }
        return left;
    }
}
