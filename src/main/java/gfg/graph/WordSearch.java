package gfg.graph;

class WordSearch
{

    static int[] xC = {-1, 0, 1, 0};
    static int[] yC = {0, 1, 0, -1};
    static class PairC{
        int x;
        int y;
        PairC(int x, int y, int count){
            this.x = x;
            this.y = y;
        }
    }

    public static boolean isSafe(int x, int y, int col, int row,char[][] grid, char ch){
        if(x>=0 && x<row && y>=0 && y<col && grid[x][y] == ch){
            return true;
        }
        return false;

    }

    public static boolean isWordExistHelper(char[][] board, int x, int y, String word, int i,int row, int col){

        if(i == word.length()){
            return true;
        }

        if(x<0 || x>=row || y<0 || y>=col || board[x][y] != word.charAt(i)){
            return false;
        }
        board[x][y] = '&';
        for(int j = 0;j<4; j++){
            int cx = x + xC[j];
            int cy = y + yC[j];
//            if(isSafe(cx, cy, col, row, board, word.charAt(i))){

                if (isWordExistHelper(board,cx, cy, word, i+1,row, col)) return true;
//            }
        }

        board[x][y] = word.charAt(i);
        return false;

    }

    public static boolean isWordExist(char[][] board, String word)
    {
        // Code here
        int row = board.length;
        int col = board[0].length;
        for(int i = 0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (word.charAt(0) == board[i][j]) {
//                    board[i][j] = '&';
                    if (isWordExistHelper(board, i, j, word, 0, row, col))
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] names = {  {'s','g', 'b', 'c'},
                            {'k','e', 'e', 'l'},
                            {'g','e', 'k', 'm'}};

        System.out.println(isWordExist(names, "geeks"));
    }
}
