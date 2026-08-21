class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
            map.put(n,map.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> set:map.entrySet())
            if(set.getValue()==1) return set.getKey();
        return -1;
    }
}
