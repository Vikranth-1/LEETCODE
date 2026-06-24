char ans[30];
char * defangIPaddr(char * address){
    int n=strlen(address),j=0;
    for(int i=0;i<n;i++,j++){
        if(address[i]=='.'){
            ans[j++]='[';
            ans[j++]='.';
            ans[j]=']';
            continue;
        }
        ans[j]=address[i];
        ans[j+1]='\0';
    }
    return ans;
}
