class Solution {
    public boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++)
            if(num%i==0) return false;
        return true;
    }
    public int numBit(int num){
        int c=0;
        while(num>0){
            if((num&1)==1) c++;
            num>>=1;
        }
        return c;
    }
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            if(isPrime(numBit(i))) c++;
        }   
        return c;
    }
}
