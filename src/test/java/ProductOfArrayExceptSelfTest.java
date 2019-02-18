import org.junit.Test;

import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {

    ProductOfArrayExceptSelf inst = new ProductOfArrayExceptSelf();

    @Test
    public void productExceptSelf() {
        int[] a = {1, 2, 3, 4};
        int[] inst = this.inst.productExceptSelf(a);
        assertArrayEquals(new int[]{24,12,8,6}, inst);
    }
}