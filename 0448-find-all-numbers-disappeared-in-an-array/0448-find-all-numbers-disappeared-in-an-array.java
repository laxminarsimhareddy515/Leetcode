class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length;
        
        for(int i=0;i<len;i++){
            set.add(nums[i]);
        }
        
        for(int i=1;i<=len;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}