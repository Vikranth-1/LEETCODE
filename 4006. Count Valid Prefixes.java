class Solution {
    public int countValidPrefixes(String s) {
        int cn=0,ans=0;
        for(char ch:s.toCharArray()){
            cn=(ch=='1')?cn+1:cn-1;
            if(cn>=-1&&cn<= 1)ans++;
        }
        return ans;
    }
}
