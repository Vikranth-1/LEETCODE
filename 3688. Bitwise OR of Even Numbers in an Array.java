class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int num=0;
        for(int n:nums)
            if((n&1)==0) num|=n; 
        return num;
    }
}
