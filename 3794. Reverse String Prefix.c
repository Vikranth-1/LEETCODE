char* reversePrefix(char* s, int k) {
    for(int i=0;i<k/2;i++){
        char t=s[i];
        s[i]=s[k-i-1];
        s[k-i-1]=t;
    }
    return s;
}
