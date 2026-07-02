class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        int value=1;
        for (int i=0;i<=rowIndex;i++) {
            row.add(value);
            value=value*(rowIndex-i)/(i+1);
        }
        return row;
    }
}
