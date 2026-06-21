#include <string.h>
#include <stdlib.h>
#include <stdio.h>
long long dp[16][11][2];
char s[20];
int K, len;
long long dfs(int p, int pre, int tight, int started) {
    if (p == len) return started;
    if (!tight && dp[p][pre + 1][started] != -1)
        return dp[p][pre + 1][started];
    long long res = 0;
    int lim = tight ? s[p] - '0' : 9;
    for (int d = 0; d <= lim; d++) {
        if (!started && d == 0)
            res += dfs(p + 1, -1, tight && d == lim, 0);
        else if (!started || abs(d - pre) <= K)
            res += dfs(p + 1, d, tight && d == lim, 1);
    }
    if (!tight) dp[p][pre + 1][started] = res;
    return res;
}
long long count(long long x) {
    if (x <= 0) return 0;
    sprintf(s, "%lld", x);
    len = strlen(s);
    memset(dp, -1, sizeof(dp));
    return dfs(0, -1, 1, 0);
}
long long goodIntegers(long long l, long long r, int k) {
    long long denoluvira[3] = {l, r, k};
    K = k;
    return count(r) - count(l - 1);
}
