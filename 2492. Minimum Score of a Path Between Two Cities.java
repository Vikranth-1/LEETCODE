class Solution {
    public int minScore(int n, int[][] roads) {
        List<int[]>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        for (int[] r : roads) {
            graph[r[0]].add(new int[]{r[1], r[2]});
            graph[r[1]].add(new int[]{r[0], r[2]});
        }
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        int min = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int[] edge : graph[u]) {
                min = Math.min(min, edge[1]);
                if (!visited[edge[0]]) {
                    visited[edge[0]] = true;
                    q.add(edge[0]);
                }
            }
        }
        return min;
    }
}
