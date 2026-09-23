class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            li.add(new ArrayList<>());
        }
        int[] id=new int[numCourses];
        for(int[] pre:prerequisites){
            li.get(pre[1]).add(pre[0]);
            id[pre[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(id[i]==0) q.add(i);
        }
        int c=0;
        while(!q.isEmpty()){
           int node=q.poll();
           c++;
           for(int el:li.get(node)) {
              id[el]--;
              if(id[el]==0) q.add(el);
           }
        }
        return c==numCourses;
    }
}
