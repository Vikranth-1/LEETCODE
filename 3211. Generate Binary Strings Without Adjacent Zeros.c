void dfs(int i, int n, char *s, char **ans, int *k) {
    if (i==n){
        ans[*k]=strdup(s);
        (*k)++;
        return;
    }
    s[i]='1';
    dfs(i + 1, n, s, ans, k);
    if (i==0 || s[i-1]=='1'){
        s[i]='0';
        dfs(i+1, n, s, ans, k);
    }
}
char** validStrings(int n, int* returnSize){
    char **ans=malloc((1<<n)*sizeof(char *));
    char s[n+1];
    s[n]='\0';
    *returnSize = 0;
    dfs(0, n, s, ans, returnSize);
    return ans;
}
