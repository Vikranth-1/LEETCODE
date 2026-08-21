class Solution {
    public boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++)
            if(num%i==0) return false;
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int firstPrime=0,lastPrime=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                firstPrime=i; 
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(isPrime(nums[i])){
                lastPrime=i;
                break;
            }
        }
        return (lastPrime-firstPrime<0)?-lastPrime+firstPrime:lastPrime-firstPrime;
    }
}
