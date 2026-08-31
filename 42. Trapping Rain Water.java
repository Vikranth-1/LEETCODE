class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1,lmax=0,rmax=0,cap=0;
        while(l<r){
            lmax=height[l]>lmax?height[l]:lmax;
            rmax=height[r]>rmax?height[r]:rmax;
            if(lmax<rmax) cap+=lmax-height[l++];
            else cap+=rmax-height[r--];
        }
        return cap;
    }
}
