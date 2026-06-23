int* findWordsContaining(char** words, int wordsSize, char x, int* returnSize) {
    *returnSize=0;
    int *arr=(int *)malloc(wordsSize*sizeof(int));
    for(int i=0;i<wordsSize;i++){
        for(int j=0;j<strlen(words[i]);j++){
            if(words[i][j]==x){
                arr[*returnSize]=i;
                (*returnSize)++;
                break;
            }
        }
    }
    return arr;
}
