int peak(int n){
    if(n>99 && n<1000){
        int m=(n%100)/10;
        if((m>n/100 && m>n%10)||(m<n/100 && m<n%10)){
            return 1;
        }
    }else if(n>999 && n<10000){
        int c=0,m1=(n%1000)/100,m2=(n%100)/10;
        if((m2>m1 && m2>n%10)||(m2<m1 && m2<n%10)){
            c++;
        }
        if((m1>n/1000 && m1>m2)||(m1<n/1000 && m1<m2)){
            c++;
        }
        return c;
    }else if(n>9999 && n<100000){
        int c=0,m1=(n%10000)/1000,m2=(n%1000)/100,m3=(n%100)/10;
        if((m1>n/10000 && m1>m2)||(m1<n/10000 && m1<m2))
            c++;
        if((m2>m1 && m2>m3)||(m2<m1 && m2<m3))
            c++;
        if((m3>m2 && m3>n%10)||(m3<m2 && m3<n%10))
            c++;
        return c;
    }
    return 0;
}
int totalWaviness(int num1, int num2) {
    int c=0;
    for(int i=num1;i<=num2;i++){
        c+=peak(i);
    }
    return c;
}
