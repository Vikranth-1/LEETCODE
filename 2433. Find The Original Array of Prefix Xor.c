int ans[100001];
int* findArray(int* pref, int prefSize, int* returnSize) {
    ans[0]=pref[0];
    for(int i=1;i<prefSize;i++){
        ans[i]=pref[i]^pref[i-1];
    }
    *returnSize=prefSize;
    return ans;
}
