package others;

import org.junit.Test;
import projecteuler.SmallestMultiple;

import static org.junit.Assert.*;

public class SmallestMultipleTest {

    SmallestMultiple inst = new SmallestMultiple();

    @Test
    public void smallest() {
        assertEquals(2520, inst.smallest(10));
        int smallest = inst.smallest(20);
        System.out.println(smallest);
    }
}