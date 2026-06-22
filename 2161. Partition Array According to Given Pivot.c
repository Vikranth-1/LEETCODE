int* pivotArray(int* nums, int numsSize, int pivot, int* returnSize) {
    int j=0;int *ans=(int *)malloc(numsSize*sizeof(int));
    for(int i=0;i<numsSize;i++){
        if(nums[i]<pivot){
            ans[j]=nums[i];
            j++;
        }
    }
    for(int i=0;i<numsSize;i++){
        if(nums[i]==pivot){
            ans[j]=nums[i];
            j++;
        }
    }
    for(int i=0;i<numsSize;i++){
        if(nums[i]>pivot){
            ans[j]=nums[i];
            j++;
        }
    }
    *returnSize=j;
    return ans;
}
