class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        for(int i=0;i<haystack.length()-needle.length();i++){
            int c=0;
            for(int j=0;j<needle.length();j++){
                char a=haystack.charAt(i+j),b=needle.charAt(j);
                if(a==b) c++;
            }
            if(c==needle.length()) return i;
        }
        return -1;
    }
}
