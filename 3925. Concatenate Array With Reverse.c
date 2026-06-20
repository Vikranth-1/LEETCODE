int* concatWithReverse(int* nums, int numsSize, int* returnSize) {
    *returnSize = 2 * numsSize;
    int *ans = (int *)malloc((*returnSize) * sizeof(int));
    for (int i = 0; i < numsSize; i++) {
        ans[i] = nums[i];
    }
    for (int i = 0; i < numsSize; i++) {
        ans[numsSize + i] = nums[numsSize - 1 - i];
    }
    return ans;
}
