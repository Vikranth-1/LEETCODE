class Solution {
    public int findDuplicate(int[] nums) {
        int[] nums1=new int[nums.length+1];
        for(int num:nums){
            if(nums1[num]==1) return num;
            else nums1[num]++;
        }
        return -1;
    }
}
