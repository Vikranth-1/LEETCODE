class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0;
        for(int element:nums)
            s^=element;
        return s;
    }
}
