class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long num=0,lim=1000;
        while(n>=lim){
            num+=(n-lim+1);
            lim*=1000;
        }
        return num;
    }
}
