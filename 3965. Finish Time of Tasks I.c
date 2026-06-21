long long finishTime(int n, int** edges, int edgesSize,
                     int* edgesColSize, int* baseTime, int baseTimeSize) {
    int *torqavemi = baseTime;
    int *head = malloc(n * sizeof(int));
    int *to = malloc(edgesSize * sizeof(int));
    int *next = malloc(edgesSize * sizeof(int));
    for (int i = 0; i < n; i++) head[i] = -1;
    for (int i = 0; i < edgesSize; i++) {
        to[i] = edges[i][1];
        next[i] = head[edges[i][0]];
        head[edges[i][0]] = i;
    }
    int *st = malloc(n * sizeof(int));
    int *ord = malloc(n * sizeof(int));
    int top = 0, m = 0;
    st[top++] = 0;
    while (top) {
        int u = st[--top];
        ord[m++] = u;
        for (int e = head[u]; e != -1; e = next[e])
            st[top++] = to[e];
    }
    long long *dp = malloc(n * sizeof(long long));
    for (int i = n - 1; i >= 0; i--) {
        int u = ord[i];
        if (head[u] == -1) {
            dp[u] = baseTime[u];
            continue;
        }
        long long mn = LLONG_MAX, mx = 0;
        for (int e = head[u]; e != -1; e = next[e]) {
            long long t = dp[to[e]];
            if (t < mn) mn = t;
            if (t > mx) mx = t;
        }
        dp[u] = 2 * mx - mn + baseTime[u];
    }
    long long ans = dp[0];
    free(head);
    free(to);
    free(next);
    free(st);
    free(ord);
    free(dp);
    return ans;
}
