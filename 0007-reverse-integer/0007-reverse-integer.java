class Solution {
    public int reverse(int x) {

        long sum=0;
        int num=x;
        int temp=0;
        if(x<0){
                x = -1*x;
            }
        
        while(x>0){
            temp = x%10;
            sum  = sum *10 + temp;
            x=x/10;
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
         return 0;
        }

       if(num > 0){
        return (int)sum;
       }
       else{return (int)(-1 * sum); 
       }

    }
}