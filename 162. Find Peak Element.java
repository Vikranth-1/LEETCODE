class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length-1;
        if(n==0) return 0;
        else if(nums[0]>nums[1]) return 0;
        else if(nums[n]>nums[n-1]) return n;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) return i;
        }
        return -1;
    }
}
