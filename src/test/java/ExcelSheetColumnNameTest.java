import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSheetColumnNameTest {

    ExcelSheetColumnName inst = new ExcelSheetColumnName();

    @Test
    public void convertToTitle() {
        String s = inst.convertToTitle(1);
        assertEquals("A", s);

        s = inst.convertToTitle(28);
        assertEquals("AB", s);

        s = inst.convertToTitle(701);
        assertEquals("ZY", s);

        s = inst.convertToTitle(26);
        assertEquals("Z", s);

    }
}