int cmp(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}
int** threeSum(int* nums, int numsSize, int* returnSize, int** returnColumnSizes) {
    qsort(nums, numsSize, sizeof(int), cmp);
    int cap = 1024;
    int **ans = (int **)malloc(cap * sizeof(int *));
    *returnColumnSizes = (int *)malloc(cap * sizeof(int));
    *returnSize = 0;
    for (int i = 0; i < numsSize - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1])
            continue;
        int l = i + 1, r = numsSize - 1;
        while (l < r) {
            long sum = (long)nums[i] + nums[l] + nums[r];
            if (sum == 0) {
                if (*returnSize == cap) {
                    cap *= 2;
                    ans = (int **)realloc(ans,cap*sizeof(int *));
                    *returnColumnSizes =
                        (int *)realloc(*returnColumnSizes,cap*sizeof(int));
                }
                ans[*returnSize] = (int *)malloc(3 * sizeof(int));
                ans[*returnSize][0] = nums[i];
                ans[*returnSize][1] = nums[l];
                ans[*returnSize][2] = nums[r];
                (*returnColumnSizes)[*returnSize] = 3;
                (*returnSize)++;
                while (l < r && nums[l] == nums[l + 1]) l++;
                while (l < r && nums[r] == nums[r - 1]) r--;
                l++;
                r--;
            }
            else if (sum < 0) {
                l++;
            }
            else {
                r--;
            }
        }
    }
    return ans;
}
