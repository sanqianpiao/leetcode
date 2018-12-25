import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    HappyNumber inst = new HappyNumber();

    @Test
    public void isHappy() {
        assertTrue(inst.isHappy(1111111));
        assertTrue(inst.isHappy(19));
    }
}