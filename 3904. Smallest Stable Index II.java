class Solution {
    public int firstStableIndex(int[] nums,int k) {
        int n=nums.length;
        int[] suf=new int[n];
        suf[n-1]=nums[n-1];
        for (int i=n-2;i>=0;i--) {
            suf[i]=(nums[i]<suf[i+1])?nums[i]:suf[i+1];
        }
        int pre=-1;         
        for (int i=0;i<n;i++) {
            pre=(pre>nums[i])?pre:nums[i];
            if(pre-suf[i]<=k) return i;
        }
        return -1;
    }
}
