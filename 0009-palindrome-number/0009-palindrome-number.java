class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; 
        }

        int a = x;
        int sum = 0;

        while (x != 0) {
            int y = x % 10;
            sum = sum * 10 + y;
            x = x/10;
        }

        return a == sum;
    
}
}