char str[1000];
char* mapWordWeights(char** words, int wordsSize, int* weights, int weightsSize) {
    for(int i=0;i<wordsSize;i++){
        int s=0,n=strlen(words[i]);
        for(int j=0;j<n;j++){
            s+=weights[(int)words[i][j]-97];
        }
        str[i]='z'-(s%26);
        str[i+1]='\0';
    }
    return str;
}
