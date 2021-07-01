package gfg.algorithm;

import java.util.ArrayList;

class Boundarytraversal
{
    //Function to return list of integers that form the boundary
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[][] v = new boolean[n][m];


        int i = 0;
        int j = 0;
        int x = 0;
        int y = 0;
        int[] xr = {0,1,0,-1};
        int[] xc = {1,0,-1,0};
        while(true){
            if(j==m){
                j--;
                i++;
                x = 1;
                y = 1;
            }else if(i == n){
                i--;
                j--;
                x = 2;
                y = 2;
            }else if(j<0){
                j++;
                i--;
                x = 3;
                y = 3;
            }
            if(v[i][j]){
                break;
            }
            v[i][j] = true;
            ans.add(matrix[i][j]);
            i+=xr[x];
            j+=xc[y];

        }

        return ans;


    }

    public static void main(String[] args) {
        int n = 2, m = 2;
        int matrix[][] = {{1, 2},
                {5, 6},
                {9, 10}};
//       int matrix[][] = {{1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12},
//            {13, 14, 15,16}};
       boundaryTraversal(matrix,n,m);
    }
}
