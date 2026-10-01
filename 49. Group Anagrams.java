class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String key=Arrays.toString(arr);
            List<String> ans=map.getOrDefault(key,new ArrayList<>());
            ans.add(str);
            map.put(key,ans);
        }
        return new ArrayList<>(map.values());
    }
}
