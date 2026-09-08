class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int val:nums) {
            set.add(val);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=1;i<=nums.length;i++) 
            if (!set.contains(i)) list.add(i);

        return list;
    }
}

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            int val=(num<0)?-num-1:num-1;
            if(nums[val]>=0) nums[val]*=-1;
        }
        for (int i=0;i<nums.length;i++) {
            if(nums[i]>0) list.add(i+1);
        }
        return list;
    }
}
