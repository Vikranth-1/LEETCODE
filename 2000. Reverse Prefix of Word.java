class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1) return word;
        StringBuilder str=new StringBuilder(word.substring(0,word.indexOf(ch)+1));
        str.reverse();
        str.append(word.substring(word.indexOf(ch)+1));
        return str.toString();
    }
}
