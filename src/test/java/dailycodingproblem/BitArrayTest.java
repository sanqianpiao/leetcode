package dailycodingproblem;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class BitArrayTest {

    @Test
    public void set() {
        BitArray ba = new BitArray(1000);
        ba.set(999, 1);
        assertEquals(1, ba.get(999));
        IntStream.range(0, 999).forEach( i -> {
            assertEquals(0, ba.get(i));
        });
    }
}