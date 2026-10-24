class Solution {
    List<List<String>> result =new ArrayList<>();

    boolean isSafe(int r,int c,int[][] res){
        for(int i=0;i<r;i++){
            if(res[i][c]==1) return false;
        }
        for(int i=0;i<c;i++){
            if(res[r][i]==1) return false;
        }
        for(int i=r,j=c;i>=0 && j>=0;i--,j--){
            if(res[i][j]==1) return false;
        }
        for(int i=r,j=c;i>=0 && j<res.length;i--,j++){
            if(res[i][j]==1) return false;
        }
        return true;
    }

    void nQueen_util(int r,int n,int[][] res){
        if(r==n){
            List<String> ans=new ArrayList<>();
            for(int[] row:res){
                StringBuilder sb=new StringBuilder();
                for(int x:row){
                    sb.append(x==1?"Q":".");
                }
                ans.add(sb.toString());
            }
            result.add(ans);
            return;
        }
        for(int c=0;c<n;c++){
            if(isSafe(r,c,res)){
                res[r][c]=1;
                nQueen_util(r+1,n,res);
                res[r][c]=0;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] arr=new int[n][n];
        nQueen_util(0,n,arr);
        return result;
    }
}
