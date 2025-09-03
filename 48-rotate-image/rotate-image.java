class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int bottom = r-1;
        while(top < bottom) {
            for(int i=0;i<r;i++) {
                int t = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = t;
            }
            top++;
            bottom--;
        }
        for(int i=0;i<r;i++) {
            for(int j=i+1;j<c;j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
}