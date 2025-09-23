class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] maxInColumn = new int[n];
        
        for (int j = 0; j < n; j++) {
            int maxVal = 0;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
            maxInColumn[j] = maxVal;
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxInColumn[j];
                }
            }
        }
        
        return matrix;
    }
}

