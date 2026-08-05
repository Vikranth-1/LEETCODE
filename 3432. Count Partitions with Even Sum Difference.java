class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for (int n:nums) total+=n;
        if ((total&1)==1) return 0;
        return nums.length-1;
    }
}
