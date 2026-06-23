#define MOD 1000000007
int zigZagArrays(int n, int l, int r) {
    int m = r - l + 1;
    long long up[m + 1], down[m + 1];
    for (int i = 1; i <= m; i++) {
        up[i] = i - 1;
        down[i] = m - i;
    }
    for (int len = 3; len <= n; len++) {
        long long nu[m + 1], nd[m + 1];
        long long pu[m + 1], pd[m + 1];
        pu[0] = pd[0] = 0;
        for (int i = 1; i <= m; i++) {
            pu[i] = (pu[i - 1] + up[i]) % MOD;
            pd[i] = (pd[i - 1] + down[i]) % MOD;
        }
        long long totalUp = pu[m];
        for (int i = 1; i <= m; i++) {
            nu[i] = pd[i - 1];
            nd[i] = (totalUp - pu[i] + MOD) % MOD;
        }
        for (int i = 1; i <= m; i++) {
            up[i] = nu[i];
            down[i] = nd[i];
        }
    }
    long long ans = 0;
    for (int i = 1; i <= m; i++)
        ans = (ans + up[i] + down[i]) % MOD;
    return (int)ans;
}
