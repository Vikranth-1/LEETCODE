class Solution {
    public String stringHash(String s, int k) {
        String str="";
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i+=k){
            int sum=0;
            for(int j=i;j<i+k;j++) sum+=arr[j]-'a';
            str+=(char)((sum%26)+'a');
        }
        return str;
    }
}
