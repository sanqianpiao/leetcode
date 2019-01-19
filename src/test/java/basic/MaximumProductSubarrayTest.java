package basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductSubarrayTest {

    MaximumProductSubarray inst = new MaximumProductSubarray();

    @Test
    public void maxProduct() {
        int[] a = {-2};
        int i = inst.maxProduct(a);
        assertEquals(-2, i);
    }
}