class Solution {
    public int balancedStringSplit(String s) {
        int b=0,c=0;
        for(char l :s.toCharArray()){
            if(l=='R') b++;
            else b--;
            if(b==0) c++;
        }
        return c;
    }
}
