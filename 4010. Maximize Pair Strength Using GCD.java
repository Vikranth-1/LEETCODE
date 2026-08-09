class Solution {
    public long maxPairStrength(int[] nums) {
        long ans=0;
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                long gc=gcd(nums[i],nums[j]);
                long pairStrength=(1L*nums[i]*nums[j])/(gc*gc);
                ans=(ans>pairStrength)?ans:pairStrength;
            }
        }
        return ans;
    }
    int gcd(int a,int b) {
        if(b==0)return a; 
        return gcd(b,a%b); 
    }
}
