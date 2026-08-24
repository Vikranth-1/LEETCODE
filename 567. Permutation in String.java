class Solution {
    public boolean isEqual(String s1,String s2) {
		int[] arr=new int[26];
		for(char ch:s1.toCharArray())
			arr[ch-'a']++;
		for(char ch:s2.toCharArray())
			arr[ch-'a']--;
        for(int num:arr)
            if(num!=0) return false;
		return true;
	}
    public boolean checkInclusion(String s1, String s2) {
    	for(int i=0;i<=s2.length()-s1.length();i++) {
    		if(isEqual(s2.substring(i,i+s1.length()),s1)) return true;
    	}
        return false;
    }
}
