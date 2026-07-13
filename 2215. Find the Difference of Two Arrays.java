class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1=new HashSet<>();
        Set<Integer> ans1=new HashSet<>();
        for(int ele:nums1)
            num1.add(ele);
        for(int ele:nums2)
            if(!num1.contains(ele)) 
                ans1.add(ele);
        Set<Integer> num2=new HashSet<>();
        Set<Integer> ans2=new HashSet<>();
        for(int ele: nums2)
            num2.add(ele);
        for(int ele: nums1)
            if(!num2.contains(ele)) 
                ans2.add(ele);
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList(ans2));
        res.add(new ArrayList(ans1));
        return res;
    }
}
