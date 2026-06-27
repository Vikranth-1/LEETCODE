int minElement(int* nums, int numsSize) {
    int m=100000;
    for(int i=0;i<numsSize;i++){
        int s=0;
        while(nums[i]>0){
            s=s+nums[i]%10;
            nums[i]/=10;
        }
        if(s<m){
            m=s;
        }
    }
    return m;
}
