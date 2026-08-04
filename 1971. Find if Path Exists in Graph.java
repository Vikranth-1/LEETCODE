class Solution {
    public boolean validPath(int n,int[][] edges,int source,int destination) {
        List<Integer>[] graph=new ArrayList[n];
        for (int i=0;i<n;i++) graph[i]=new ArrayList<>();
        for (int[] e:edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        visited[source]=true;
        while (!q.isEmpty()) {
            int u=q.poll();
            if (u==destination) return true;
            for (int v:graph[u]) {
                if (!visited[v]) {
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
        return false;
    }
}
