const char *keypad[] = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
void dfs(char *digits, int pos, char *curr,char **ans, int *idx) {
    if (digits[pos] == '\0') {
        ans[*idx] = strdup(curr);
        (*idx)++;
        return;
    }
    const char *letters = keypad[digits[pos] - '0'];
    for (int i = 0; letters[i]; i++) {
        curr[pos] = letters[i];
        dfs(digits, pos + 1, curr, ans, idx);
    }
}
char **letterCombinations(char *digits, int *returnSize) {
    *returnSize = 0;
    if (!digits || !digits[0])
        return NULL;
    int total = 1, len = strlen(digits);
    for (int i = 0; i < len; i++)
        total *= strlen(keypad[digits[i] - '0']);
    char **ans = malloc(total * sizeof(char *));
    char *curr = malloc(len + 1);
    curr[len] = '\0';
    dfs(digits, 0, curr, ans, returnSize);
    free(curr);
    return ans;
}
