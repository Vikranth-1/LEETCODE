int mirrorDistance(int n) {
    int r=0,t=n;
    while(n>0){
        r=r*10+n%10;
        n/=10;
    }
    if(r<t){
        r=t-r;
    }else{
        r=r-t;
    }
    return r;
}
