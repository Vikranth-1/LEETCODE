class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums[0],c=1,m=1;
        for(int i=1;i<nums.length;i++){
            if(n<nums[i]){
                c++;
                m=(c>m)?c:m;
                n=nums[i];
            }else{
                c=1;
                n=nums[i];
            }
        }
        return m;
    }
}
