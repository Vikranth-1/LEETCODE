int ans[2001];
int* minOperations(char* boxes, int* returnSize) {
    int c=0;
    *returnSize=0;
    while(boxes[c]!='\0'){
        c++;
    }
    for(int i=0;i<c;i++){
        int m=0;
        for(int j=0;j<c;j++){
            if(boxes[j]=='1'){
                m+=abs(i-j);
            }
        }
        ans[i]=m;
        (*returnSize)++;
    }
    return ans;
}
