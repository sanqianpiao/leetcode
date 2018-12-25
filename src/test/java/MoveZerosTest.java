import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZerosTest {

    MoveZeros inst = new MoveZeros();

    @Test
    public void moveZeroes() {
        int[] a = {0, 0, 1};
        inst.moveZeroes(a);
        assertArrayEquals(new int[]{1, 0, 0}, a);
    }
}