class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length,left = 0,sum = 0,minLen =nums.length+1;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = (minLen> right - left + 1)?right - left + 1:minLen;
                sum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
