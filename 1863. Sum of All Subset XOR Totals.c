int subsetXORSum(int* nums, int numsSize) {
    int s=nums[0];
    for(int i=1;i<numsSize;i++){
        s|=nums[i];
    }
    return s*(1<<(numsSize-1));
}
