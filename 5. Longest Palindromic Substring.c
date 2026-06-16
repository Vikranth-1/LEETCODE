int pal(char *s, int i, int j) {
    while (i < j) {
        if (s[i] != s[j])
            return 0;
        i++;
        j--;
    }
    return 1;
}
char result[10000];
char* longestPalindrome(char* s) {
    int n = strlen(s);
    int m = 1;
    int h = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            if (pal(s, i, j)) {
                if (j - i + 1 > m) {
                    h = i;
                    m = j - i + 1;
                }
            }
        }
    }
    strncpy(result, s + h, m);
    result[m] = '\0';
    return result;
}
