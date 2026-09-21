class NumArray {
    int[] tree;
    int n;
    public NumArray(int[] nums) {
        n=nums.length;
        tree=new int[4*n];
        build(nums,0,0,n-1);
    }
    void build(int[] arr,int node,int st,int end) {
        if(st==end) {
            tree[node]=arr[st];
            return;
        }
        int mid=st+(end-st)/2;
        build(arr,2*node+1,st,mid);
        build(arr,2*node+2,mid+1,end);
        tree[node]=tree[2*node+1]+tree[2*node+2];
    }

    public void update(int index,int val) {
        updateTree(0,0,n-1,index,val);
    }

    void updateTree(int node,int st,int end,int index,int value) {
        if(st==end) {
            tree[node]=value;
            return;
        }
        int mid=(st+end)/2;
        if(index<=mid)
            updateTree(2*node+1,st,mid,index,value);
        else
            updateTree(2*node+2,mid+1,end,index,value);
        tree[node]=tree[2*node+1]+tree[2*node+2];
    }

    public int sumRange(int left,int right) {
        return rangeQuery(0,0,n-1,left,right);
    }

    int rangeQuery(int node,int st,int end,int l,int r) {
        if(r<st || end<l) return 0;
        if(l<=st && end<=r) return tree[node];
        int mid=(st+end)/2;
        int lSum=rangeQuery(2*node+1,st,mid,l,r);
        int rSum=rangeQuery(2*node+2,mid+1,end,l,r);
        return lSum+rSum;
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
