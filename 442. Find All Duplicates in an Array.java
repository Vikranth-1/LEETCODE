class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) ans.add(num);
            set.add(num);
        }
        return ans;
    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int num:nums){
            int val=(num<0)?-num-1:num-1;
            if(nums[val]<0) ans.add(val+1);
            else nums[val]*=-1;
        }
        return ans;
    }
}
