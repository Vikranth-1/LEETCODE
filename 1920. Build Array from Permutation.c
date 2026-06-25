int ans[1001];
int* buildArray(int* nums, int numsSize, int* returnSize) {
    for(int i=0;i<numsSize;i++){
        ans[i]=nums[nums[i]];
    }
    *returnSize=numsSize;
    return ans;    
}
