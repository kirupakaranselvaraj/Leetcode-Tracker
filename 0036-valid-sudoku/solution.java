class Solution {
    public boolean isValidSudoku(char[][] a) {
        boolean[][] r = new boolean[9][9];
        boolean[][] c = new boolean[9][9];
        boolean[][] b = new boolean[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == '.') continue;
                int n = a[i][j] - '1';
                int k = (i / 3) * 3 + j / 3;
                if (r[i][n] || c[j][n] || b[k][n])
                    return false;
                r[i][n] = c[j][n] = b[k][n] = true;
            }
        return true;
    }
}
