import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalToBase7Test {

    DecimalToBase7 inst = new DecimalToBase7();

    @Test
    public void convert() {
        int convert = inst.convert(723, 8);
        assertEquals(Integer.toOctalString(723), convert + "");

        int b = inst.convert(723, 2);
        assertEquals(Integer.toBinaryString(723), b + "");
    }

    @Test
    public void convert2() {
        String b7 = inst.convert(7);
        assertEquals("a0", b7);

        assertEquals("atlassian", inst.convert(7792875));
    }
}