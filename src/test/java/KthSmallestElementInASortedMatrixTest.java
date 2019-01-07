import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestElementInASortedMatrixTest {

    KthSmallestElementInASortedMatrix inst = new KthSmallestElementInASortedMatrix();

    @Test
    public void kthSmallest() {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int num = inst.kthSmallest(matrix, 8);
        assertEquals(13, num);
    }

    @Test
    public void kthSmallest2() {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int num = inst.kthSmallest(matrix, 2);
        assertEquals(5, num);
    }
}