class Solution {
    public int[] plusOne(int[] digits) {

        int len = digits.length;
        int r1[] = Arrays.copyOf(digits,len);
        boolean t=true;
        for(int i=len-1; i>=0;i--)
        {
        if(t){
            r1[i]++;
            if(r1[i]>9){
                r1[i]=0;
                t=true;
            }
            else{
                t=false;
            }
        }

        }

        if(t){
            int r2[]=new int[len+1];
            System.arraycopy(r1,0,r2,1,len);
            r2[0]=1;
            return r2;
        }
        else{
            return r1;
        }     
    }
}









