class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] r = new boolean[9][9];
        boolean[][] c = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i =0; i<9; i++){
            for(int j=0; j<9; j++){
       
               char ch = board[i][j];

                if(ch == '.'){
                   continue;
                }

                int num = ch - '1';
                int boxIndex = (i/3)*3+(j/3);

                if(r[i][num]||c[j][num]|| boxes[boxIndex][num]){
                    return false;
                }

                r[i][num] = true;
                c[j][num]= true;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }
}
