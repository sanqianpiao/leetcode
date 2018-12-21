package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTableTest {

    MultiplicationTable inst = new MultiplicationTable();
    @Test
    public void numberOfTimes() {
        int i = inst.numberOfTimes(6, 12);
        assertEquals(4, i);
    }
}