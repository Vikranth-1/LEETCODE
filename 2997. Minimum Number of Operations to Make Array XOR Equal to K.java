class Solution {
    public int minOperations(int[] nums, int k) {
        int fin=0,c=0;
        for(int n:nums) fin^=n;
        while(k>0 || fin>0){
            if(k%2 != fin%2) c++;
            k/=2;
            fin/=2;
        }
        return c;
    }
}
