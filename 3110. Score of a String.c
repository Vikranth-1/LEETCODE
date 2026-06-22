int scoreOfString(char* s) {
    int n=strlen(s),c=0;
    for(int i=0;i<(n-1);i++){
        if(((int)s[i]>(int)s[i+1])){
            c+=(int)s[i]-(int)s[i+1];
        }else if(((int)s[i]<(int)s[i+1])){
            c+=(int)s[i+1]-(int)s[i];
        } 
    }
    return c;
}
