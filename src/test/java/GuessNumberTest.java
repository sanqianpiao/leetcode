import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    @Test
    public void guessNumber() {
        int limit = 1000;
        for (int i = 1; i <= limit; i++) {
            int target = i;
            GuessNumber inst = new GuessNumber(target);
            int j = inst.guessNumber(limit);
            assertEquals(target, j);
            System.out.println(target + ": " + inst.count);
        }

    }
}