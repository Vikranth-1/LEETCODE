class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            ans.add(index[i],nums[i]);
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}
