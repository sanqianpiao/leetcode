import org.junit.Test;

import static org.junit.Assert.*;

public class PowTest {

    Pow inst = new Pow();

    @Test
    public void myPow() {
        assertEquals(1024d, inst.myPow(2.0, 10), 0d);
    }

    @Test
    public void name() {
        assertEquals(4d, inst.myPow(2.0, 2), 0d);
    }

    @Test
    public void name2() {
        assertEquals(0.25d, inst.myPow(2.0, -2), 0.01d);
    }

    @Test
    public void name3() {
        assertEquals(0.25d, inst.myPow(1.0, -2), 1d);
    }
}