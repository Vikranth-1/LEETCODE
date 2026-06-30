int findPermutationDifference(char* s, char* t) {
    int sum=0;
    for(int i=0;i<strlen(s);i++){
        for(int j=0;j<strlen(t);j++){
            if(s[i]==t[j]){
                sum=sum+((i>j)?i-j:j-i);
            }
        }
    }
    return sum;
}
