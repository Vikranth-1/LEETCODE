class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int max=nums[0],min=nums[i];
            for(int j=1;j<=i;j++)
                if(nums[j]>max) max=nums[j];
            for(int j=i+1;j<nums.length;j++)
                if(nums[j]<min) min=nums[j];
            if(max-min<=k) return i;
        }
        return -1;
    }
}
