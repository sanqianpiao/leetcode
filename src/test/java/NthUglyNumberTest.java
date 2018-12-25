import org.junit.Test;

import static org.junit.Assert.*;

public class NthUglyNumberTest {

    NthUglyNumber inst = new NthUglyNumber();

    @Test
    public void nthUglyNumber() {
        assertEquals(1, inst.nthUglyNumber(1));
        assertEquals(2, inst.nthUglyNumber(2));
        assertEquals(3, inst.nthUglyNumber(3));
        assertEquals(4, inst.nthUglyNumber(4));
        assertEquals(5, inst.nthUglyNumber(5));
        assertEquals(6, inst.nthUglyNumber(6));
        assertEquals(8, inst.nthUglyNumber(7));
    }

    @Test
    public void isUgly() {
        assertTrue(inst.isUgly(2));
        assertTrue(inst.isUgly(3));
        assertTrue(inst.isUgly(4));
        assertTrue(inst.isUgly(5));
        assertTrue(inst.isUgly(6));

        assertFalse(inst.isUgly(7));
    }

    @Test
    public void nextPrime() {
        assertEquals(2, inst.nextPrime(1));
        assertEquals(3, inst.nextPrime(2));
        assertEquals(5, inst.nextPrime(3));
        assertEquals(7, inst.nextPrime(5));
    }
}