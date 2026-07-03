class Solution {
    public int alternateDigitSum(int n) {
        int s0=0,s1=0,c=0;
        while(n!=0){
            if(c%2==0)
                s0+=n%10;
            else
                s1+=n%10;
            n/=10;
            c++;
        }
        if(c%2==0)
            return s1-s0;
        return s0-s1;
    }
}
