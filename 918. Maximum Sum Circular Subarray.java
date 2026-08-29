class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0,currMax = 0,maxSum = Integer.MIN_VALUE,currMin = 0,minSum = Integer.MAX_VALUE;
        for (int num : nums) {
            totalSum += num;
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
        }
        if (maxSum < 0)
            return maxSum;
        
        return Math.max(maxSum, totalSum-minSum);
    }
}
