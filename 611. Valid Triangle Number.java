class Solution {
    public int triangleNumber(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int idx=nums.length-1;idx>1;idx--){
            int l=0,r=idx-1;
            while(l<r){
                if(nums[l]+nums[r]>nums[idx]){
                    c+=(r-l);
                    r--;
                }else l++;
            }
        }
        return c;
    }
}
