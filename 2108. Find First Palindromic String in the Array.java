class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            boolean flag=true;
            int n=word.length();
            for(int i=0,j=n-1;i<n && j>=i;i++,j--){
                if(word.charAt(i)!=word.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag) return word;
        }
        return "";
    }
}
