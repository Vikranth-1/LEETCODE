class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int ans[]=new int[1001];
        for (int trip[]:trips){
            ans[trip[1]]+=trip[0];
            ans[trip[2]]-=trip[0];
        }
		int carLoad=0;
        for (int i=0;i<1001;i++){
            carLoad+=ans[i];
		    if(carLoad>capacity) return false;
        }
        return true;
    }
}
