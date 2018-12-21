package basic;

import basic.NextGreaterElement;
import org.junit.Test;

public class NextGreaterElementTest {

    NextGreaterElement inst = new NextGreaterElement();

    @Test
    public void next() {
        int[] a = {4, 5, 2, 25};
        inst.next(a);
    }
}