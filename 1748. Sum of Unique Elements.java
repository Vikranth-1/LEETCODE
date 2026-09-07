class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr=new int[101];
        int sum=0;
        for(int ele:nums)
            arr[ele]++;
        for(int ele:nums)
            if(arr[ele]==1) 
                sum+=ele;
        return sum;
    }
}
