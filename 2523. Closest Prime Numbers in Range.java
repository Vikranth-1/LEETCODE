class Solution {
    public boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left,int right) {
        int prev=-1;
        int num1=-1,num2=-1;
        int minDiff=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                if(prev!=-1){
                    int diff=i-prev;
                    if(diff<minDiff){
                        minDiff=diff;
                        num1=prev;
                        num2=i;
                    }
                }
                prev=i;
            }
        }
        if(num1==-1) return new int[]{-1,-1};
        return new int[]{num1,num2};
    }
}
