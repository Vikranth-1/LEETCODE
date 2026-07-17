class Solution {
    public boolean canAliceWin(int[] nums) {
        int dd=0,sd=0;
        for(int n:nums){
            int num=n,c=0;
            while(num>0){
                c++;
                num/=10;
            }
            if(c==2) dd+=n;
            else if(c==1) sd+=n;
        }
        return (dd-sd!=0);
    }
}
