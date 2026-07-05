class Solution {
    public String interpret(String command) {
        StringBuilder s=new StringBuilder(command.length());
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G') s.append("G");
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')') {
                    s.append('o'); 
                    i++;
                }else{
                    s.append("al");
                    i=i+3;
                }
            }
        }
        return s.toString();
    }
}
