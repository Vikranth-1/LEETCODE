int countConsistentStrings(char * allowed, char ** words, int wordsSize){
    int c=0;
    for(int i=0;i<wordsSize;i++){
        int v=0;
        for(int j=0;j<strlen(words[i]);j++){
            for(int k=0;k<strlen(allowed);k++){
                if(words[i][j]==allowed[k]) v++;
            }
        }
        if(v==strlen(words[i])) c++;
    }
    return c;
}
