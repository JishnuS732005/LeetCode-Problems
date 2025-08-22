class Solution {
    public int minimumArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int minr = row, maxr = -1;;
        int minc = col, maxc = -1;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(grid[i][j] == 1) {
                    minr = Math.min(minr, i);
                    maxr = Math.max(maxr, i);
                    minc = Math.min(minc, j);
                    maxc = Math.max(maxc, j);
                }
            }
        }
        if(maxr == -1) return 0;
        return (maxr-minr+1) * (maxc-minc+1);
    }
}