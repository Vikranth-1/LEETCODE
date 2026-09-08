class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        for(int[] inter:intervals){
            if(ans.isEmpty()) ans.add(inter);
            else{
                if(ans.get(ans.size()-1)[1]>=inter[0]){
                    ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],inter[1]);
                }else ans.add(inter);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
