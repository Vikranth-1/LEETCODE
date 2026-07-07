class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        int[] charIndex = new int[26];
        int[] wordIndex = new int[words.length]; 
        String[] uniqueWords = new String[words.length];
        int wordCount = 0;
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            int wIdx = -1;
            for (int j = 0; j < wordCount; j++) {
                if (uniqueWords[j].equals(w)) {
                    wIdx = j;
                    break;
                }
            }
            if (wIdx == -1) {
                uniqueWords[wordCount] = w;
                wIdx = wordCount;
                wordCount++;
            }
            if (charIndex[c - 'a'] != wordIndex[wIdx]) return false;
            charIndex[c - 'a'] = i + 1;
            wordIndex[wIdx] = i + 1;
        }
        return true;
    }
}
