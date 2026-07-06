class Solution {
    public int removeDuplicates(int[] nums) {
        int s=0;
        for(int j=1;j<nums.length;j++){
            if(nums[s] != nums[j]){
                s++;
                nums[s]=nums[j];
            }
        }
        return s+1;
    }
}
