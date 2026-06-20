int cmp(const void *a, const void *b) {
    int *x = *(int **)a;
    int *y = *(int **)b;
    return x[0] - y[0];
}
int min(int a, int b) {
    return a < b ? a : b;
}
int maxBuilding(int n, int** restrictions, int restrictionsSize, int* restrictionsColSize) {
    int **arr = (int **)malloc((restrictionsSize + 2) * sizeof(int *));
    for (int i = 0; i < restrictionsSize; i++) {
        arr[i] = (int *)malloc(2 * sizeof(int));
        arr[i][0] = restrictions[i][0];
        arr[i][1] = restrictions[i][1];
    }
    arr[restrictionsSize] = (int *)malloc(2 * sizeof(int));
    arr[restrictionsSize][0] = 1;
    arr[restrictionsSize][1] = 0;
    int m = restrictionsSize + 1;
    qsort(arr, m, sizeof(int *), cmp);
    if (arr[m - 1][0] != n) {
        arr[m] = (int *)malloc(2 * sizeof(int));
        arr[m][0] = n;
        arr[m][1] = n - 1;
        m++;
    }
    for (int i = 1; i < m; i++) {
        arr[i][1] = min(
            arr[i][1],
            arr[i - 1][1] + (arr[i][0] - arr[i - 1][0])
        );
    }
    for (int i = m - 2; i >= 0; i--) {
        arr[i][1] = min(
            arr[i][1],
            arr[i + 1][1] + (arr[i + 1][0] - arr[i][0])
        );
    }
    long long ans = 0;
    for (int i = 1; i < m; i++) {
        long long h1 = arr[i - 1][1];
        long long h2 = arr[i][1];
        long long d = arr[i][0] - arr[i - 1][0];
        long long peak = (h1 + h2 + d) / 2;
        if (peak > ans)
            ans = peak;
    }
    for (int i = 0; i < m; i++)
        free(arr[i]);
    free(arr);
    return (int)ans;
}
