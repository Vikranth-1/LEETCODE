int* findDegrees(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    int *ans = (int *)calloc(matrixSize, sizeof(int));
    for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
            ans[i] += matrix[i][j];
        }
    }
    *returnSize = matrixSize;
    return ans;
}
