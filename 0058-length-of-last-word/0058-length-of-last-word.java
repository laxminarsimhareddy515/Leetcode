class Solution {
    public int lengthOfLastWord(String s) {
        
    
    int count=0;
    int sum=0;
    for(int i=s.length()-1;i>=0;i--)
    {
        if(s.charAt(i)!=' ')
        {
            sum++;
        }
        if(s.charAt(i)==' ' && count>0 && sum>0)
        {
            break;           
          
        }
        count++;
    }   
    return sum;
        
    }
}