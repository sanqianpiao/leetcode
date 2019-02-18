package projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class _10001stPrimeTest {

    _10001stPrime inst = new _10001stPrime();

    @Test
    public void prime() {
        assertEquals(2, inst.prime(1));
        assertEquals(3, inst.prime(2));
        assertEquals(5, inst.prime(3));
        assertEquals(7, inst.prime(4));
        assertEquals(11, inst.prime(5));
        assertEquals(13, inst.prime(6));
        assertEquals(17, inst.prime(7));
        assertEquals(19, inst.prime(8));
        assertEquals(19, inst.prime(8));
        assertEquals(23, inst.prime(9));
        assertEquals(29, inst.prime(10));
        assertEquals(43, inst.prime(14));
        System.out.println(inst.prime(10001));
    }
}