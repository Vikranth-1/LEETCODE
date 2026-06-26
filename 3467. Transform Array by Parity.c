int* transformArray(int* nums, int numsSize, int* returnSize) {
    int z=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]%2==0){
            nums[z++]=0;
        }
    }
    for(int i=z;i<numsSize;i++){
        nums[i]=1;
    }
    *returnSize=numsSize;
    return nums;
}
