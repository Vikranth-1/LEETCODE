class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> subset=new ArrayList<>();
        permute_util(nums,subset);
        return result;
    }
    void permute_util(int[] num,List<Integer> subset){
        if(subset.size()==num.length) {
        	result.add(new ArrayList<>(subset));
        }
        for(int i=0;i<num.length;i++) {
        	if(!subset.contains(num[i])){
        		subset.add(num[i]);
        		permute_util(num,subset);
        		subset.remove(subset.size()-1);
        	}
        }
    }
}
