char* toBinary(int n){
    char temp[32];
    int i=0;
    if(n==0){
        char *res=(char *)malloc(2);
        strcpy(res,"0");
        return res;
    }
    while(n>0){
        temp[i]=(n%2)+'0';
        n/=2;
        i++;
    }
    char *res= (char *)malloc(i+1);
    int j;
    for(j=0;j<i;j++){
        res[j]=temp[i-j-1];
    }
    res[i]='\0';
    return res;
}
char* convertDateToBinary(char* date){
    int year, month, day;
    year=(date[0]-'0')*1000+(date[1]-'0')*100+(date[2]-'0')*10+(date[3]-'0');
    month=(date[5]-'0')*10+(date[6]-'0');
    day=(date[8]-'0')*10+(date[9]-'0');
    char *yearBin=toBinary(year);
    char *monthBin=toBinary(month);
    char *dayBin=toBinary(day);
    char *result=(char *)malloc(100);
    strcpy(result,yearBin);
    strcat(result,"-");
    strcat(result,monthBin);
    strcat(result,"-");
    strcat(result,dayBin);
    free(yearBin);
    free(monthBin);
    free(dayBin);
    return result;
}
