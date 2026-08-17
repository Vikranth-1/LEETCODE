class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int j=0;j<k;j++){
            int minindex=0;
            for(int x=1;x<nums.length;x++){
                if(nums[minindex]>nums[x]) minindex=x;
            }
            nums[minindex]=nums[minindex]*multiplier;
        }
        return nums;
    }
}
