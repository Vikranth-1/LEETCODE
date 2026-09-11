class Solution {
    public int findMaxValueOfEquation(int[][] points,int k) {
        Deque<int[]> dq=new ArrayDeque<>();
        int max=Integer.MIN_VALUE;
        for (int[] p:points) {
            int x=p[0],y=p[1];
            while (!dq.isEmpty() && x-dq.peekFirst()[0]>k)
                dq.pollFirst();
            if (!dq.isEmpty()) 
                max=Math.max(max,y+x+dq.peekFirst()[1]);
            while (!dq.isEmpty() && dq.peekLast()[1]<=y-x)
                dq.pollLast();
            dq.offerLast(new int[]{x,y-x});
        }
        return max;
    }
}
