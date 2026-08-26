class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int l=0,r=0,pro=1,c=0;
        while(r<nums.length){
            pro*=nums[r];
            while(pro>=k) pro/=nums[l++];
            c+=1+(r-l);
            r++;
        }
        return c;
    }
}
