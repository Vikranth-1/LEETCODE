class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans=new int[n];
        for(int[] arr:bookings){
            for(int i=arr[0]-1;i<arr[1];i++)
                ans[i]+=arr[2];
        }
        return ans;
    }
}
