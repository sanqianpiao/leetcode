package projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPalindromeProductTest {

    LargestPalindromeProduct inst = new LargestPalindromeProduct();

    @Test
    public void largeset() {
        assertEquals(9009, inst.largeset(2));
        assertEquals(906609, inst.largeset(3));
    }
}