class Solution {
    public int maxArea(int[] height) {
    
        int left = 0, right = height.length-1;
        int area = 0;
        int maxarea = -1;
        while(right>=left){
            if(height[left]>height[right])
            {
                
                area = height[right]*(right-left);
                right--;
            }
            else
            {
                area = height[left]*(right-left);
                left++;
            }

            if(maxarea<=area){
                maxarea = area;
            } 

        }
        return maxarea;
    }
    
}