char a[1001];
char* convert(char* s, int n) {
    if (n == 1) return s;
    int len = strlen(s);
    int index = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < len; j +=2*(n-1)) {
            a[index++] = s[j];
            if (i > 0 && i<n-1 && j+2*(n-1)-2*i<len) {
                a[index++] = s[j + 2*(n - 1)-2*i];
            }
        }
    }
    a[index]='\0';
    return a;
}
