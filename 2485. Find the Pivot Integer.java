class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        for(int i=(n/2)-1;i<=n;i++){
            int s1=0,s2=0;
            for(int j=1;j<=i;j++){
                s1+=j;
            }
            for(int j=i;j<=n;j++){
                s2+=j;
            }
            if(s1==s2)
                return i;
        }
        return -1;
    }
}
