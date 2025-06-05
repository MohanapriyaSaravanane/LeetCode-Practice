class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int i = 0, ecol = cols - 1;
        while (i < rows) {
            int last = matrix[i][ecol];
            if (last == target) {
                return true;
            } else if (last > target) {
                for (int j = 0; j < cols - 1; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
                return false;
            } else {
                i++;
            }
        }
        return false;
    }
}
