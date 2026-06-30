bool ans[10001];
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    for(int i=0;i<candiesSize;i++){
        for(int j=0;j<candiesSize;j++){
            if(candies[i]+extraCandies<candies[j]){
                ans[i]=false;
                break;
            }
            ans[i]=true;
        }
    }
    *returnSize=candiesSize;
    return ans;
}
