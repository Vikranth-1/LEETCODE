class Solution {
    public int bs(int[] nums,int l,int r,int tar){
        if(l>r) return -1;
        int mid=l+(r-l)/2;
        if(nums[mid]==tar) return mid;
        else if(nums[mid]<tar) return bs(nums,mid+1,r,tar);
        else return bs(nums,l,mid-1,tar);
    }
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
}
