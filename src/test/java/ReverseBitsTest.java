import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBitsTest {

    ReverseBits rb = new ReverseBits();

    @Test
    public void reverseBits() {
        Integer input = Integer.valueOf("00000010100101000001111010011100", 2);
        int i = rb.reverseBits(input);
        assertEquals(964176192, i);
    }
}