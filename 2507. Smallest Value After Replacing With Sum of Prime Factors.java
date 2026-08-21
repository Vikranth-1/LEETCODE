class Solution {
    public boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    int sumPrimeFactors(int num){
        int sum=0;
        int temp=num;
        for(int i=2;i*i<=temp;i++){
            while(num%i==0){
                sum+=i;
                num/=i;
            }
        }
        if(num>1) sum+=num;
        return sum;
    }
    public int smallestValue(int n) {
        while(!isPrime(n)){
            int next=sumPrimeFactors(n);
            if(next==n) break;
            n=next;
        }
        return n;
    }
}
