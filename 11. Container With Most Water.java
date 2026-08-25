class Solution {
    int area(int a,int b){return a*b;}
    public int maxArea(int[] height) {
        int s=0,e=height.length-1,max=0;
        while(s<e){
            int cursum=area(e-s,height[s]<height[e]?height[s]:height[e]);
            max=(max>cursum)?max:cursum;
            if(height[s]>=height[e]) e--;
            else s++; 
        }
        return max;
    }
}
