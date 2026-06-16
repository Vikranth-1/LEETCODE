int lengthOfLongestSubstring(char* s) {
    int n = strlen(s);
    int maxLen = 0;
    for (int i = 0; i < n; i++) {
        int freq[128] = {0};
        for (int j = i; j < n; j++) {
            if (freq[s[j]])
                break;
            freq[s[j]] = 1;
            int len = j - i + 1;

            if (len > maxLen)
                maxLen = len;
        }
    }
    return maxLen;
}
