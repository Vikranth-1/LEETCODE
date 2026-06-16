char* processStr(char* s) {
    static char result[10000000];
    int ri = 0;
    for (int i = 0; s[i] != '\0'; i++) {
        if (s[i] >= 'a' && s[i] <= 'z') {
            result[ri++] = s[i];
        }
        else if (s[i] == '*') {
            if (ri > 0)
                ri--;
        }
        else if (s[i] == '#') {
            int r = ri;

            for (int j = 0; j < r; j++) {
                result[ri] = result[j];
                ri++;
            }
        }
        else if (s[i] == '%') {
            for (int l = 0, r = ri - 1; l < r; l++, r--) {
                char temp = result[l];
                result[l] = result[r];
                result[r] = temp;
            }
        }
    }
    result[ri] = '\0';
    return result;
}
