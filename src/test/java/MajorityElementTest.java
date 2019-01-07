import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {

    MajorityElement inst = new MajorityElement();

    @Test
    public void majorityElement() {
        int[] a = {2, 2, 1, 1, 1, 2, 2};
        int maj = inst.majorityElement(a);
        assertEquals(2, maj);
    }
}