class Solution {
    private int x = 0;
    private int y = 0;

    public void nextBox(){
        if(x == 6){
            x = 0;
            y += 3;
        }else{
            x += 3;
        }
    }
    
    private void show(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean markZeroIfExists(char notUsed[], char ch){
        for(int i = 0; i < notUsed.length; i++){
            if(notUsed[i] == ch){
                notUsed[i] = '0';
                return false;
            }
        }
        return true; // not exists
    }

    public boolean isValidRow(char[][] board, int row){
        char notUsed[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
            for(int j = 0; j < board[row].length; j++){
                if(board[row][j] != '.'){
                    if(markZeroIfExists(notUsed, board[row][j])){
                        // repeated value
                        return false;
                    }
                }
            }
        
        return true;
    }

    public boolean isValidColumn(char[][] board, int column){
        char notUsed[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
            for(int j = 0; j < board.length; j++){
                if(board[j][column] != '.'){
                    if(markZeroIfExists(notUsed, board[j][column])){
                        // repeated value
                        return false;
                    }
                }
            }
        
        return true;
    }

    public boolean isValidBox(char[][] board){
        char notUsed[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for(int i = this.y; i < this.y + 3; i++){
            for(int j = x; j < this.x + 3; j++){
                if(board[i][j] != '.'){
                    if(markZeroIfExists(notUsed, board[i][j])){
                        // repeated value
                        return false;
                    }
                }
            }
        }
        
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        show(board);

        for(int i = 0; i < 9; i++){
            if(!isValidRow(board, i)){
                System.out.println("Row: " + i);
                return false;
            }
        }

        for(int i = 0; i < 9; i++){
            if(!isValidColumn(board, i)){
                System.out.println("Column: " + i);
                return false;
            }
        }

        for(int i = 0; i < 9; i++, nextBox()){
            
            if(!isValidBox(board)){
                System.out.println(x+" "+y);
                return false;
            }
        }

        return true;
    }
}