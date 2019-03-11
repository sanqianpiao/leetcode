package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestNumberOfSquaredIntegersTest {

    SmallestNumberOfSquaredIntegers inst = new SmallestNumberOfSquaredIntegers();

    @Test
    public void smallesetNumber() {
        assertEquals(1, inst.smallesetNumber(1));
        assertEquals(2, inst.smallesetNumber(2));
        assertEquals(3, inst.smallesetNumber(3));
        assertEquals(1, inst.smallesetNumber(4));
        assertEquals(2, inst.smallesetNumber(5));
        assertEquals(2, inst.smallesetNumber(13));
        assertEquals(3, inst.smallesetNumber(27));
    }
}