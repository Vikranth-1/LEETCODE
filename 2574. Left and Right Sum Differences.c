int arr[1001];
int* leftRightDifference(int* nums, int numsSize, int* returnSize) {
    int left=0,right=0;
    for(int i=0;i<numsSize;i++){
        right+=nums[i];
    }
    for(int i=0;i<numsSize;i++){
        right-=nums[i];
        if(left>right){
            arr[i]=left-right;
        }else{
            arr[i]=right-left;
        }
        left+=nums[i];
    }
    *returnSize=numsSize;
    return arr;
}
