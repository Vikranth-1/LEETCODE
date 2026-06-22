int maxNumberOfBalloons(char* s) {
    int w=strlen(s),b=0,a=0,l=0,o=0,n=0,c=0;
    for(int i=0;i<w;i++){
        if(s[i]=='b'){
            b++;
        }else if(s[i]=='a'){
            a++;
        }else if(s[i]=='l'){
            l++;
        }else if(s[i]=='o'){
            o++;
        }else if(s[i]=='n'){
            n++;
        }
    }
    while(b>0&&a>0&&l>1&&o>1&&n>0){
        if(b>=1&&a>=1&&l>=2&&o>=2&&n>=1){
            c++;
            b--;a--;n--;l=l-2;o=o-2;
        }
    }
    return c;
}
