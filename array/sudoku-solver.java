class Solution {
    public static boolean recursion(char[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j] == '.'){
                    for(char psb = '1';psb<='9';psb++){
                        if(possible(board,psb,i,j)){
                            board[i][j] = psb;
                            if (recursion(board))
                                return true;
                        }
                            board[i][j] = '.';
                    }
                return false;
                }
                
            }
        }
        return true;
    }
    public static boolean possible(char[][] board,char ch,int i,int j){
        for(int k = 0;k<9;k++){
            if(board[i][k] == ch)return false;
            if(board[k][j] == ch)return false;

        }
        int r = (i / 3) * 3;
        int c = (j / 3) * 3;

        for (int m = r; m < r + 3; m++) {
            for (int n = c; n < c + 3; n++) {
                if (board[m][n] == ch)
                    return false;
            }
        }

        return true;
    }
    public void solveSudoku(char[][] board) {
        recursion(board);
    }
}