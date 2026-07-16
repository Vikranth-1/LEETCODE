class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int c=0;
        for(int i=1;i<s.length();i++){
            int cur=s.charAt(i-1);
            int nex=s.charAt(i);
            if(cur!=nex) c++;
        }
        return c;
    }
}
