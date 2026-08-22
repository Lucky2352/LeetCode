class Solution {
    public void gameOfLife(int[][] board) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                int count = 0;
                    //center ka top
                    if(i > 0 && (board[i - 1][j] == 1 || board[i - 1][j] == 2))count++;
                    //CENTER KA BOTTOM
                    if(i < board.length - 1 && (board[i + 1][j] == 1 || board[i + 1][j] == 2))count++;
                    //center ka left
                    if(j > 0 && (board[i][j - 1] == 1 || board[i][j - 1] == 2))count++;
                    //center ka right
                    if(j < board[0].length - 1 && (board[i][j + 1] == 1|| board[i][j +1] == 2))count++;
                    //left diagonal top
                    if(i > 0 && j > 0 && (board[i - 1][j - 1] == 1|| board[i - 1][j - 1] == 2))count++;
                    //right diagonal top
                    if(i >0 && j < board[0].length - 1 && (board[i - 1][j+1] == 1 || board[i - 1][j +1] == 2))count++;
                    //bottom diagonal left
                    if(i < board.length - 1 && j > 0 && (board[i+1][j - 1] == 1 || board[i + 1][j - 1] == 2))count++;
                    //bottom diagonal right
                    if(i <board.length - 1 && j < board[0].length - 1 && (board[i + 1][j + 1] == 1 || board[i + 1][j + 1] == 2))count++;

                    if(board[i][j] == 1){
                        if(count == 2 || count == 3){
                            board[i][j] = 1;
                        }
                        else if(count < 2){
                            board[i][j] = 2;
                        }
                        else{
                            board[i][j] = 2;
                        }
                    }
                    else{
                        if(count == 3){
                            board[i][j] = -1;
                        }
                    }
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == 2){
                    board[i][j] = 0;
                }
                if(board[i][j] == -1)board[i][j] = 1;
            }
        }
    }
}