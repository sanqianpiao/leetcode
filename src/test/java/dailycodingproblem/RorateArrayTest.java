package dailycodingproblem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RorateArrayTest {

    RorateArray inst = new RorateArray();

    @Test
    public void rorate() {
        int[] a = {1, 2, 3, 4, 5, 6};
        inst.rorate(a, 2);
        System.out.println(Arrays.toString(a));
        assertArrayEquals(new int[]{3, 4, 5, 6, 1, 2}, a);
    }
}