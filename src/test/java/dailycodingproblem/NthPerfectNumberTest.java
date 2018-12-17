package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthPerfectNumberTest {

    NthPerfectNumber ins = new NthPerfectNumber();

    @Test
    public void sumOfDigits() {
        int sum  = ins.sumOfDigits(10);
        assertEquals(1, sum);
    }

    @Test
    public void perfect() {
        int p = ins.perfect(2);
        assertEquals(28 ,p);

        p = ins.perfect(15);
        assertEquals(154, p);
    }
}