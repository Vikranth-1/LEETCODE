class Solution {
    public long countSubarrays(int[] nums, long k) {
        int l=0;
        long sum=0,c=0;
        for(int r=0;r<nums.length;r++){
            sum+=(long)nums[r];
            while(sum*(r-l+1)>=k) sum-=nums[l++];
            c+=(r-l+1);
        }
        return c;
    }
}
