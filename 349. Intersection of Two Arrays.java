class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1=new HashSet<>();
        for(int ele:nums1)
            num1.add(ele);
        Set<Integer> ans=new HashSet<>();
        for(int ele:nums2){
            if(num1.contains(ele))
                ans.add(ele);
        }
        int res[]=new int[ans.size()],i=0;
        for(int ele :ans)
            res[i++]=ele;
        return res;
    }
}
