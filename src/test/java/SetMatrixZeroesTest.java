import org.junit.Test;

import static org.junit.Assert.*;

public class SetMatrixZeroesTest {

    SetMatrixZeroes inst = new SetMatrixZeroes();

    @Test
    public void setZeroes() {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        inst.setZeroes(matrix);
    }
}