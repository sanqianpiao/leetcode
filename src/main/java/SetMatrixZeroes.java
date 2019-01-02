import java.util.Arrays;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;

        for (int i = 0; i < r; i++) {

            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < r; i++) {
            for(int j = 1; j < c; j++) {

            }
        }

    }

    public void fillColumnWithZero(int[][] matrix, int c) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][c] = 0;
        }
    }
}
