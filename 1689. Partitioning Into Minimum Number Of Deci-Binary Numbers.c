int minPartitions(char* n) {
    char m='0';
    for(int i=0;i<strlen(n);i++){
        if(n[i]>m){
            m=n[i];
        }
    }
    return (int)m-48;
}
