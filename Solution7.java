import java.util.Arrays;

public class Solution7 {
    // Proper transpose for rectangular matrices
    public static int[][] transpose(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] trans = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 6, 10},
            {8, 5, 9},
            {9, 4, 15},
            {7, 3, 60}
        };

        // Transpose to columns-as-rows
        int[][] Tmat = transpose(mat); // now 3 x 4

        // Sort each row (i.e., each original column)
        for (int i = 0; i < Tmat.length; i++) {
            Arrays.sort(Tmat[i]);
        }

        // Transpose back to original shape
        mat = transpose(Tmat); // back to 4 x 3

        // Print result
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}