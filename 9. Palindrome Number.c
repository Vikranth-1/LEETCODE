bool isPalindrome(int s) {
    if(s<0)
        return FALSE;
    long int r,n=0,x=s;
    while(s>0){
        r=s%10;
        if(n*10+r > INT_MAX)
            return FALSE; 
        n=n*10+r;
        s/=10;
    }
    if(x==n)
        return TRUE;
    return FALSE;
}
