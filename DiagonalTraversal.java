class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows*cols];
        int i = 0;
        for (int d = 0; d < rows + cols - 1; d++) {
            int row, col;
            if (d % 2 == 0) {
                row = (d < rows) ? d : rows - 1;
                col = d - row;
                while (row >= 0 && col < cols) {
                    res[i++] = mat[row][col];
                    row--;
                    col++;
                }
            } else {
                col = (d < cols) ? d : cols - 1;
                row = d - col;
                while (col >= 0 && row < rows) {
                    res[i++] = mat[row][col];
                    row++;
                    col--;
                }
            }
        }

        return res;
    }
}
