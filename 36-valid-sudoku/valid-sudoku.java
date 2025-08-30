class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                char num = board[i][j];
                if(num != '.') {
                    if(!s.add(num+"in row"+i) || !s.add(num+"in col"+j) || !s.add(num+"in box"+(i/3)+"-"+(j/3))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}