class Solution {
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0) return false;
        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int largPrime=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][i]) && nums[i][i]>largPrime) largPrime=nums[i][i];
        }
        for(int i=nums.length-1,j=0;i>=0;i--,j++){
            if(isPrime(nums[i][j]) && nums[i][j]>largPrime) largPrime=nums[i][j];
        }
        return largPrime;
    }
}
