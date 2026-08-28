class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int a=0;a<nums.length;a++){
            int b=a+1,c=nums.length-1;
            while(b<c){
                if(nums[a]+nums[b]+nums[c]==0){
                    ans.add(Arrays.asList(nums[a],nums[b],nums[c]));
                    b++;
                    c--;
                }else if(nums[a]+nums[b]+nums[c]<0) b++;
                else c--;
            }
        }
        return new ArrayList<>(ans);
    }
}
