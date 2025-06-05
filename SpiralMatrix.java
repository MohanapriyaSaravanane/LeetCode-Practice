class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;
        int srow = 0,scol = 0,erow = rows-1,ecol=cols-1;
        while(srow<=erow && scol<=ecol){
            // top
            for(int j=scol;j<=ecol;j++){
                res.add(matrix[srow][j]);
            }
            // right
            for(int i=srow+1;i<=erow;i++){
                res.add(matrix[i][ecol]);
            }
            // bottom
            for(int j=ecol-1;j>=scol;j--){
                if(srow == erow) break;
                res.add(matrix[erow][j]);
            }
            // left
            for(int i=erow-1;i>=srow+1;i--){
                if(scol == ecol) break;
                res.add(matrix[i][scol]);
            }
            srow++;scol++;erow--;ecol--;
        }
        return res;

    }
}
