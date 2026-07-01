#define MAX 400
#define INF 1000000000
typedef struct{
    int x,y;
}Node;
int d[4][2]={{1,0},{-1,0},{0,1},{0,-1}};
void bfs(int **grid,int n,int dist[MAX][MAX]){
    Node q[MAX*MAX];
    int f=0, r = 0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if(grid[i][j]){
                dist[i][j]=0;
                q[r++] = (Node){i,j};
            }
            else
                dist[i][j]=INF;
        }
    }
    while(f<r){
        Node cur=q[f++];
        for(int k=0;k<4;k++){
            int x=cur.x+d[k][0];
            int y = cur.y+d[k][1];
            if(x>=0 && x<n && y>=0 && y<n &&
                dist[x][y] > dist[cur.x][cur.y]+1){
                dist[x][y]=dist[cur.x][cur.y]+1;
                q[r++] = (Node){x,y};
            }
        }
    }
}
bool check(int dist[MAX][MAX],int n,int val){
    if(dist[0][0] < val) return false;
    bool vis[MAX][MAX]={0};
    Node q[MAX*MAX];
    int f = 0,r=0;
    q[r++] = (Node){0,0};
    vis[0][0]=true;
    while(f<r){
        Node cur = q[f++];
        if(cur.x==n-1 && cur.y==n-1)
            return true;
        for(int k=0;k<4;k++){
            int x = cur.x+d[k][0];
            int y=cur.y+d[k][1];
            if(x>=0 && x<n && y>=0 && y<n &&!vis[x][y] &&dist[x][y]>=val){
                vis[x][y]=true;
                q[r++] = (Node){x,y};
            }
        }
    }
    return false;
}
int maximumSafenessFactor(int **grid,int n,int *gridColSize){
    int dist[MAX][MAX];
    bfs(grid,n,dist);
    int l=0;
    int h=2*n;
    int ans = 0;
    while(l<=h){
        int mid=(l+h)/2;
        if(check(dist,n,mid)){
            ans=mid;
            l = mid+1;
        }
        else
            h=mid-1;
    }
    return ans;
}
