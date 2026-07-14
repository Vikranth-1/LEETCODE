class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            int rowMin = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isLucky = true;
            for (int r = 0; r < rows; r++) {
                if (matrix[r][colIndex] > rowMin) {
                    isLucky = false;
                    break;
                }
            }   
            if (isLucky) {
                result.add(rowMin);
            }
        }        
        return result;
    }
}
