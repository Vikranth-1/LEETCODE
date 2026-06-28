int maximumWealth(int** accounts, int accountsSize, int* accountsColSize) {
    int m=0;
    for(int i=0;i<accountsSize;i++){
        int s=0;
        for(int j=0;j<accountsColSize[i];j++){
            s+=accounts[i][j];
        }
        if(s>m) m=s;
    }
    return m;
}
