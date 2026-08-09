class Solution {
    public int largestInteger(int n, int sum) {
        if(sum==0) return 0;
        if (sum>9*n||sum<1) return -1;
        int fullNines=sum/9;
        int remainder=sum%9;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<fullNines;i++) sb.append('9');
        if (remainder>0) sb.append(remainder);
        while (sb.length()<n) sb.append('0');
        return Integer.parseInt(sb.toString());
    }
}
