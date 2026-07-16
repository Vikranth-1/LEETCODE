class Solution {
    public int countDigits(int num) {
        int num1=num,c=0;
        while(num>0){
            if(num1%(num%10)==0 && (num%10)!=0) c++;
            num/=10;
        }
        return c;
    }
}
