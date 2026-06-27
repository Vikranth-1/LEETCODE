int maxFreqSum(char* s) {
    int mc=0,mv=0;
    for(int i=0;i<strlen(s);i++){
        int c=0;
        for(int j=i;j<strlen(s);j++){
            if(s[i]==s[j]) c++;
        }
        if((s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')&&(c>mv)){
            mv=c;
        }else if((s[i]!='a'&&s[i]!='e'&&s[i]!='i'&&s[i]!='o'&&s[i]!='u')&&(c>mc)){
            mc=c;
        }
    }
    return mv+mc;
}
