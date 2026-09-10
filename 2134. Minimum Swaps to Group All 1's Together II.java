class Solution {
    public int minSwaps(int[] nums) {
        int k=Arrays.stream(nums).sum(),n=nums.length,c=0;
        for(int i=0;i<k;i++)
            c+=nums[i];
        int m=c;
        for(int i=k;i<n+k;++i){
            c+=nums[i%n]-nums[(i-k+n)%n];
            m=Math.max(m,c);
        }
        return k-m;
    }
}
