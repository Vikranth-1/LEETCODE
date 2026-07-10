class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sentence : sentences){
            String[] word=sentence.split(" ");
            int c=word.length;
            if(max<c) max=c;
        }
        return max;
    }
}
