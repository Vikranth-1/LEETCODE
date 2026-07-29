class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> f=new HashMap<>();
        for (int n:nums1) {
            f.put(n,f.getOrDefault(n,0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for (int n:nums2) {
            if (f.containsKey(n)&&f.get(n)>0) {
                res.add(n);
                f.put(n,f.get(n)-1);
            }
        }
        int[] ans=new int[res.size()];
        for (int i=0;i<res.size();i++) {
            ans[i]=res.get(i);
        }
        return ans;
    }
}
