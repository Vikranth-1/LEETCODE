class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set=new HashSet<>();

        for(int i=0;i<words.length;i++){
            String str=words[i],strAns="";
            for(int j=0;j<str.length();j++){
                strAns+=arr[((int)str.charAt(j))-97];
            }
            set.add(strAns);
        }

        return set.size();
    }
}
