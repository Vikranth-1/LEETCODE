double* convertTemperature(double C, int* returnSize) {
    double *arr=(double *)malloc(2*sizeof(double));
    arr[0]=C+273.15;arr[1]=C*1.80+32.00;
    *returnSize=2;
    return arr;
}
