class Solution {
    public int maxDistinct(String s) {
        int[] arr=new int[26];
        int c=0;
        for(char ch:s.toCharArray()){
            int temp = arr[ch-'a'];
            if(temp!=1) arr[ch-'a']++;
            else continue;
            c++;
        }
        return c;
    }
}
