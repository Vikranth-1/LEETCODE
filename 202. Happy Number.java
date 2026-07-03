class Solution {
    public static int digSquare(int n){
        if (n<=3) return 0;
        int s=0;
        while(n>0){
            int r=n%10;
            s+=(r*r);
            n/=10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        while(n>4){
            n=digSquare(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
}
