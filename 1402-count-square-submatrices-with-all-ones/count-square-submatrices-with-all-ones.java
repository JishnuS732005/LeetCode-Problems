class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int sum = 0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(matrix[i][j] == 1 && i>0 && j>0) {
                    matrix[i][j] = 1 + Math.min(
                        Math.min(matrix[i-1][j],matrix[i][j-1]),matrix[i-1][j-1]
                    );
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}