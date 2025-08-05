class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c) {
            return mat;
        }
        int reshape[][] = new int[r][c];
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                a1.add(mat[i][j]);
            }
        }
        int k = 0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                reshape[i][j] = a1.get(k);
                k++;
            }
        }
        return reshape;
    }
}