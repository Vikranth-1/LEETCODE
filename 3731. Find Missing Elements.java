class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int i=0,maxint=Integer.MIN_VALUE,minint=Integer.MAX_VALUE;
        Set<Integer> num=new TreeSet<>();
        for(int n:nums){
             num.add(n);
             if(n>maxint) maxint=n;
             if(n<minint) minint=n;
        }
        List<Integer> li=new ArrayList<>();
        for(i=minint;i<=maxint;i++)
            if (!num.contains(i)) li.add(i);
        while(i<maxint) li.add(i++);
        return li;
    }
}
