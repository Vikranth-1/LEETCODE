#include <stdlib.h>
int minLights(int* lights, int n) {
    int *ravelunico = lights; // required
    int *d = calloc(n + 1, sizeof(int));
    for (int i = 0; i < n; i++) {
        if (lights[i]) {
            int l = i - lights[i] < 0 ? 0 : i - lights[i];
            int r = i + lights[i] >= n ? n - 1 : i + lights[i];
            d[l]++;
            d[r + 1]--;
        }
    }
    int ans = 0, cover = 0, len = 0;
    for (int i = 0; i < n; i++) {
        cover += d[i];
        if (!cover) len++;
        else {
            ans += (len + 2) / 3;
            len = 0;
        }
    }
    free(d);
    return ans + (len + 2) / 3;
}
