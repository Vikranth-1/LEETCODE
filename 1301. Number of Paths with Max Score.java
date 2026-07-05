class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n=board.size();
        int [][] score=new int [n+1][n+1];
        int [][] count =new int [n+1][n+1];
        for(int i=0;i<=n;i++) 
            Arrays.fill(score[i],-1);
        score[n-1][n-1]=0;
        count[n-1][n-1]=1;
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(board.get(i).charAt(j)=='X') continue;
                if(i==n-1 && j==n-1) continue;
                int maxScore=-1,ways=0;
                int[][] dirs={{i+1,j},{i,j+1},{i+1,j+1}};
                for (int[] d:dirs){
                    int x=d[0], y=d[1];
                    if(x<n && y<n && score[x][y] !=-1){
                        int can=score[x][y];
                        if(can>maxScore){
                            maxScore=can;
                            ways=count[x][y];
                        }else if(can==maxScore){
                            ways=(ways+count[x][y])%1000000007;
                        }
                    }
                }
                if(maxScore != -1){
                    char c=board.get(i).charAt(j);
                    int val =((c=='E' || c=='S')? 0: c-'0');
                    score[i][j]=maxScore +val;
                    count[i][j]=ways;
                }
            }
        }
        if(score[0][0]==-1) return new int[]{0,0};
        return new int[] {score[0][0],count[0][0]};
    }
}
