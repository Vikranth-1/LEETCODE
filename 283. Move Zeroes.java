class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length>1){
            Arrays.sort(nums);
            while(nums[0]==0){
                for(int i=0;i<nums.length-1;i++){
                    nums[i]=nums[i+1];
                }
                nums[nums.length-1]=0;
            }
        }
    }
}
