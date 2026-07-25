class Solution {
    public int maxProduct(int n) {
        int pro=0;
        List<Integer> list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j!=i && j<list.size();j++){
                if(list.get(i)*list.get(j)>pro) pro=list.get(i)*list.get(j);
            }
        }
        return pro;
    }
}
