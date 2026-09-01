class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> seen=new HashSet<>();
        int sum=0,prev=0;
        for (int num:nums) {
            sum+=num;
            int rem=(k==0)?sum:sum%k;
            if (seen.contains(rem)) return true;
            seen.add(prev);
            prev=rem;
        }
        return false;
    }
}
