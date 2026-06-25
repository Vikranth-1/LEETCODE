int arr[1001];
int* recoverOrder(int* order, int orderSize, int* friends, int friendsSize, int* returnSize) {
    *returnSize=0;
    for(int i=0;i<orderSize;i++){
        for(int j=0;j<friendsSize;j++){
            if(order[i]==friends[j]){
                arr[(*returnSize)++]=order[i];
            }
        }
    }
    return arr;
}
