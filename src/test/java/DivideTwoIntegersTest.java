import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTwoIntegersTest {

    DivideTwoIntegers inst = new DivideTwoIntegers();

    @Test
    public void divide() {
        assertEquals(3, inst.divide(10, 3));
        assertEquals(3, inst.divide(9, 3));
        assertEquals(2147483647 / 2, inst.divide(2147483647, 2));
        assertEquals(-2147483648 / 2, inst.divide(-2147483648, 2));
    }
}