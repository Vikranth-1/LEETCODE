class Solution {
    public int longestValidParentheses(String s) {
        if (s==null||s.length()==0) return 0;
        int[] stack=new int[s.length()+1];
        int high=0,maxLen=0;
        stack[high]=-1;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='(') {
                stack[++high]=i;
            } else {
                high--; 
                if (high==-1) {
                    stack[++high]=i;
                } else {
                    maxLen=(maxLen>i-stack[high])?maxLen:i-stack[high];
                }
            }
        }
        return maxLen;
    }
}
