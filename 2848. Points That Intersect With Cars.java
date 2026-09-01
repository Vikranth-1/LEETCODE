class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set=new HashSet<>();
        for(List<Integer> list:nums){
            for(int j=list.get(0);j<=list.get(1);j++)
                set.add(j);
        }
        return set.size();
    }
}
