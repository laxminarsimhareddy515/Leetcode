// class Solution {
//     public int removeDuplicates(int[] nums) {
        
//         HashSet<Integer> set = new HashSet<>();
        
//         int len=nums.length;
//         int index=0;
        
//         for(int num:nums){
//             if(!set.contains(nums[num])){
//                 set.add(nums[num]);
//                 nums[index++]=num;
//             }
            
//         }
        
//         return index;
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        int len=nums.length;
        
        for(int num:nums){
            if(!list.contains(num)){
                list.add(num);   
            }   
        }
        
        for(int i=0; i<list.size();i++){
           nums[i]=list.get(i);
        }
        
        return list.size();
    }
}