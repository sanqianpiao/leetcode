import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalRectangleTest {

    MaximalRectangle inst = new MaximalRectangle();

    @Test
    public void maximalRectangle() {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int res = inst.maximalRectangle(matrix);
        assertEquals(6, res);
    }
}