class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> interval = new ArrayList<>();
        for (int[] arr : intervals) {
            if (arr[1] < newInterval[0]) {
                interval.add(arr);
            }
            else if (arr[0] > newInterval[1]) {
                interval.add(newInterval);
                newInterval = arr;
            }
            else {
                newInterval[0] = Math.min(newInterval[0], arr[0]);
                newInterval[1] = Math.max(newInterval[1], arr[1]);
            }
        }
        interval.add(newInterval);
        return interval.toArray(new int[interval.size()][]);
    }
}
