class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum=0,dSum=0;
        for(int num:nums){
            eSum+=num;
            while(num>0){
                dSum+=(num%10);
                num/=10;
            }
        }
        return (eSum>dSum)? eSum-dSum:dSum-eSum;
    }
}
