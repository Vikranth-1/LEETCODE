class Solution {
    public static int digSquare(int n){
        int s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    public int addDigits(int num) {
        while(num>9){
            num=digSquare(num);
        }
        return num;
    }
}
