import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalculatorIITest {

    BasicCalculatorII inst = new BasicCalculatorII();

    @Test
    public void calculate() {
        assertEquals(0, inst.calculate("1+ 2 + 3-6"));
        assertEquals(4, inst.calculate("2* 2"));
        assertEquals(1, inst.calculate(" 3/2 "));
    }
}