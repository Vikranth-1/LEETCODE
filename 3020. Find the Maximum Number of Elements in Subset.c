#define HSIZE 1000000001
int cmp(const void*a, const void*b)
{
    return *(int*)a-*(int*)b;
}
int maximumLength(int* nums, int numsSize) {
    qsort(nums, numsSize, sizeof(int), cmp);
    int* hash = calloc(HSIZE, sizeof(int));
    for(int i=0;i<numsSize;i++)
    {
        hash[nums[i]]++;
    }
    int ans = 0;
    for(int i=0;i<numsSize;i++)
    {
        if(i>0&&nums[i]==nums[i-1])
        {
            continue;
        }
        int count = 1;
        if(nums[i]==1)
        {
            if(hash[1]&1)
            {
                count=hash[1];
            }
            else
            {
                count=hash[1]-1;
            }
        }
        else
        {
            long long pre   = nums[i];
            long long power = pre*pre;
            while(power < HSIZE && hash[power] && hash[pre]>=2)
            {
                count+=2;
                pre = power;
                power*=power;
            }
        }
        ans=fmax(ans, count);
    }
    free(hash);
    return ans;
}
