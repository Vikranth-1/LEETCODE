class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subset = new ArrayList<>();
        combinationSum_util(candidates, target, subset, 0);
        return result;
    }
    void combinationSum_util(int[] nums, int target, List<Integer> subset, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (target < 0 || index >= nums.length) {
            return;
        }
        subset.add(nums[index]);
        combinationSum_util(nums, target - nums[index], subset, index);
        subset.remove(subset.size() - 1);
        combinationSum_util(nums, target, subset, index + 1);
    }
}
