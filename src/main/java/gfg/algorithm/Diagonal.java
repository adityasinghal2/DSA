package gfg.algorithm;

class Diagonal
{
    public static int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        int r = matrix.length;
        int c = matrix[0].length;
        int[] ans = new int[r *c];
        int i = 0;
        int row = 0;
        int col = 0;
        int d = 0;
        boolean flag = true;
        int[][] dir = {{0,1},{1,0}};
        while(row<r && col < c && i < r*c){
            ans[i] = matrix[row][col];
            i++;
            int x = row+1;
            int y = col-1;
            while(x<r && y>=0){
                ans[i]   = matrix[x][y];
                x++;
                y--;
                i++;
            }

            if(col == (c-1) && flag){
                d = 1;
                col = c-1;
                row = 0;
                flag = false;
            }


            row = row + dir[d][0];
            col = col + dir[d][1];



        }

        return ans;

    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},

            {4,5,6},

            {7,8,9}};
        antiDiagonalPattern(matrix);
    }
}
