double findMedianSortedArrays(int* n1, int n1S, int* n2, int n2S) {
    int arr[2000];
    int i = 0, j = 0, k = 0;
    while (i < n1S && j < n2S) {
        if (n1[i] < n2[j])
            arr[k++] = n1[i++];
        else
            arr[k++] = n2[j++];
    }
    while (i < n1S)
        arr[k++] = n1[i++];
    while (j < n2S)
        arr[k++] = n2[j++];

    int n = n1S + n2S;
    if (n % 2 == 1)
        return arr[n / 2];
    return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
}
