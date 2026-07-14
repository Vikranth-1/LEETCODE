class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> res=new HashMap<>();
        int i=0;
        for(int[] arr : mat){
            int s=0;
            for(int ele:arr){
                s+=ele;
            }
            res.put(i++,s);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(res.entrySet());
        Collections.sort(list,(a,b)->a.getValue().compareTo(b.getValue()));
        for(int j=0;j<k;j++){
            ans[j]=list.get(j).getKey();
        }
        return ans;
    }
}
