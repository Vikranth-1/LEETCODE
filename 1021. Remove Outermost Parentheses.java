class Solution {
    public String removeOuterParentheses(String s) {
        String str="";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(c>0) str+='(';
                c++;
            }else if(s.charAt(i)==')'){
                c--;
                if(c>0) str+=')';
            }
        }
        return str;
    }
}
