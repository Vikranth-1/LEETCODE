class Solution {
    public String reverseWords(String s) {
        String[] str1=s.trim().split("\\s+");
        String str2="";
        for(int i=str1.length-1;i>0;i--)
            str2+=str1[i]+" ";
        return str2+str1[0];
    }
}
