package leedcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReshapeMatrix {

    public static void main(String[] args) {

        int [][] mat ={{1,2},
                        {3,4}};

        // deepToString is used for Multi Dimensional Array int [][]
        System.out.println(Arrays.deepToString(reshapeMatrix(mat, 1, 4)));
    }

    public static int [][]reshapeMatrix(int [][] mat, int r, int c){

        int m= mat.length;
        int n=mat[0].length;

        if(m*n != r*c){
            return mat;
        }

        int row=0;
        int col= 0;

        int [][] ans= new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                ans[row][col]= mat[i][j];
                col++;

                if(col == c){
                    col=0;
                    row++;
                }
            }
        }
        return ans;
    }
}
