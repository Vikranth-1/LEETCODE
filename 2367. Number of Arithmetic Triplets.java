class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        boolean[] vis=new boolean[201];
        for(int n:nums){
            if(n>=2*diff && vis[n-diff] && vis[n-2*diff]) c++;
            vis[n]=true;
        }
                
        return c;
    }
}

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
                for(int k=j+1;k<nums.length;k++)
                    if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff) c++;
                
        return c;
    }
}
