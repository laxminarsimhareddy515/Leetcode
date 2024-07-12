class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len=s.length();
        int left=0;
        int maxlen=0;
        
        HashSet<Character> set = new HashSet<>();
        
        for(int right=0;right<len;right++)
        {
            char curr= s.charAt(right);
            
            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(curr);
            maxlen=Math.max(maxlen,right-left+1);
        }
        
     return maxlen;   
    }
}