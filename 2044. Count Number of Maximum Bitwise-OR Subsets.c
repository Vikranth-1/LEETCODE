int countMaxOrSubsets(int* nums, int numsSize) {
    int m=0,c=0;
    for(int i=0;i<numsSize;i++)
        m=m|nums[i];
    int total = 1 << numsSize;
    for (int mask = 1; mask < total; mask++) {
        int currOR = 0;
        for (int i = 0; i < numsSize; i++) {
            if (mask & (1 << i))
                currOR |= nums[i];
        }
        if (currOR == m) 
            c++;
    }
    return c;
}
