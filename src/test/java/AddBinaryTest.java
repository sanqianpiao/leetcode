import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    AddBinary ab = new AddBinary();

    @Test
    public void addBinary() {
        String s = ab.addBinary("11", "1");
        assertEquals("100", s);
    }
}