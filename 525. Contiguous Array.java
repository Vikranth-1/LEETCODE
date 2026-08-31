class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> prefixMap=new HashMap<>();
        prefixMap.put(0,-1);
        int Sum=0,max=0;
        for (int i=0;i<nums.length;i++) {
            Sum+=(nums[i]==1)? 1:-1;
            if (prefixMap.containsKey(Sum))
                max=Math.max(max,i-prefixMap.get(Sum));
            else prefixMap.put(Sum,i);
        }
        return max;
    }
}
