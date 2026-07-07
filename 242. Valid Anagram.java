class Solution {
    public boolean isAnagram(String s, String t) {
        int[] strS=new int[200],strT=new int[200];
        for(int i=0;i<s.length();i++)
            strS[s.charAt(i)]+=1;
        for(int i=0;i<t.length();i++)
            strT[t.charAt(i)]+=1;
        for(int i=60;i<128;i++){
            if(strS[i]!=strT[i]) return false;
        }
        return true;
    }
}
