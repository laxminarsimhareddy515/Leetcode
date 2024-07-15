class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int len= nums.length;
        int ans=-1;
        int flag=0;
        for(int i=0;i<len;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=len;i++){
            if(!set.contains(i)){
                flag=1;
                ans=i;
                break;
            }
            
        }
        
    if(flag==1){
      return ans;  
    }
    else{
       return len+1;   
    }
}}