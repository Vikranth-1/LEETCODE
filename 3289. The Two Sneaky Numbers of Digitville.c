int arr[500];
int* getSneakyNumbers(int* nums, int numsSize, int* returnSize) {
    *returnSize=0;
    for(int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++){
            if(nums[i]==nums[j]){
                arr[(*returnSize)++]=nums[i];
            }
        }
    }
    return arr;
}
