class Solution {
    public boolean search(int[] nums, int num) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==num) return true;
            if(nums[m]==nums[l]) { l++; continue;}
            if(nums[l]<=nums[m]){
                if(nums[l]<=num && num<nums[m]) r=m-1;
                else l=m+1;
            }else{
                if(nums[m]<num && num<=nums[r]) l=m+1;
                else r=m-1;
            }
        }
        return false;
    }
}
