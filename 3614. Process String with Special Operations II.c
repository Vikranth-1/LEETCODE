long long min(long long a, long long b) {
    return a < b ? a : b;
}
char processStr(char* s, long long k) {
    int n = strlen(s);
    long long len[n + 1];
    len[0] = 0;
    for (int i = 0; i < n; i++) {
        char c = s[i];
        if (c >= 'a' && c <= 'z') {
            len[i + 1] = min((long long)1e15, len[i] + 1);
        }
        else if (c == '*') {
            len[i + 1] = (len[i] > 0) ? len[i] - 1 : 0;
        }
        else if (c == '#') {
            len[i + 1] = min((long long)1e15, len[i] * 2);
        }
        else {
            len[i + 1] = len[i];
        }
    }
    if (k >= len[n])
        return '.';
    for (int i = n - 1; i >= 0; i--) {
        char c = s[i];
        long long prev = len[i];
        long long curr = len[i + 1];
        if (c >= 'a' && c <= 'z') {
            if (k == prev)
                return c;
        }
        else if (c == '*') {
        }
        else if (c == '#') {
            if (k >= prev)
                k -= prev;
        }
        else {
            if (curr > 0)
                k = curr - 1 - k;
        }
    }
    return '.';
}
