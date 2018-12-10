import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSwapTest {

    MaximumSwap ms = new MaximumSwap();

    @Test
    public void maximumSwap() {
        assertEquals(ms.maximumSwap(2736), 7236);
    }

    @Test
    public void maximumSwap2() {
        assertEquals(ms.maximumSwap(98368), 98863);
    }
}