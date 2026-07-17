class Solution {
    public int calPoints(String[] operations) {
        List<Integer> arr = new ArrayList<>();
        for (String s : operations) {
            if (s.equals("D")) {
                arr.add(arr.get(arr.size() - 1) * 2);
            } else if (s.equals("C")) {
                arr.remove(arr.size()-1);
            } else if (s.equals("+")) {
                arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
            } else {
                arr.add(Integer.parseInt(s));
            }
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
