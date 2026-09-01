class Solution {
    public int totalFruit(int[] fruits) {
        int max=Integer.MIN_VALUE,lf=-1,slf=-1,c=0,curmax=0;
        for(int i=0;i<fruits.length;i++){
            if(fruits[i]==lf || fruits[i]==slf) curmax++;
            else curmax=c+1;
            if(fruits[i]==lf) c++;
            else{
                c=1;
                slf=lf;
                lf=fruits[i];
            }
            max=(curmax>max)?curmax:max;
        }   
        return max;
    }
}
