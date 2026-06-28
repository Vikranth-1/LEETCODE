int ans[10001];
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    *returnSize=0;
    for(int i=0;i<n;i++){
        ans[(*returnSize)++]=nums[i];
        ans[(*returnSize)++]=nums[i+n];
    }
    return ans;
}
