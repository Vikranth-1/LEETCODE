class Solution {
    public int countCharacters(String[] words, String chars) {
        int s=0;
        int[] chars1=new int[26];
        for(char c:chars.toCharArray())
            chars1[c-'a']++;
        for(String word : words){
            int[] str1=new int[26];
            for(char c:word.toCharArray())
                str1[c-'a']++;
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(chars1[i]<str1[i]){
                    flag=false;
                    break;
                }
            }
            if(flag) s+=word.length();
        }
        return s;
    }
}
