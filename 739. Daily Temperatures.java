class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for (int i=0;i<n;i++) {
            while (!s.isEmpty() && nums[s.peek()]<nums[i]) {
                int idx=s.pop();
                ans[idx]=i-idx; 
            }
            s.push(i);
        }
        return ans;
    }
}
