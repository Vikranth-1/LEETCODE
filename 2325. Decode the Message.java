class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map=new HashMap<>();
        char a='a';
        for(char ch:key.toCharArray()){
            if(ch!=' ' && !map.containsKey(ch)) map.put(ch,a++);
        }
        String ans="";
        for(char ch:message.toCharArray()){
            if(ch==' ') ans+=' ';
            else ans+=map.get(ch);
        }
        return ans;
    }
}
