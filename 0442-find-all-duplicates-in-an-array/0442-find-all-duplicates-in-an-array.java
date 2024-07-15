class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<len;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
         
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==2){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}