package basic;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchZeroOneTest {

    BinarySearchZeroOne inst = new BinarySearchZeroOne();

    @Test
    public void findFirstOne() {
        int[] a = new int[1000];
        Arrays.fill(a, 800, a.length, 1);
        int firstOne = inst.findFirstOne(a);
        assertEquals(800, firstOne);
    }

    @Test
    public void findFirstOne2() {
        int[] a = new int[100000];
        Arrays.fill(a, 800, a.length, 1);
        int firstOne = inst.findFirstOne(a);
        assertEquals(800, firstOne);
    }
}