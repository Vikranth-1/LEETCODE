int reverseDegree(char* s) {
    int ans=0;
    for(int i=0;i<strlen(s);i++){
        ans=ans+('z'-s[i]+1)*(i+1);
    }
    return ans;
}
