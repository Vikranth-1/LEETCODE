class Solution {
    public int setbit(int num){
        int c=0;
        while(num>0){
            if((num&1)==1) c++;
            num>>=1;
        }
        return c;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int c=0;
        for(int i=0;i<nums.size();i++)
            if(setbit(i)==k) c+=nums.get(i);
        
        return c;
    }
}
