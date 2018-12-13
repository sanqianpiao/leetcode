package dailycodingproblem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BishopsTest {

    Bishops bishops;

    @Before
    public void setUp() throws Exception {
        bishops = new Bishops();
    }

    @Test
    public void count() {
        int[][] chessboard = {
                {1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0}};
        int count = bishops.count(chessboard);
        System.out.println(count);
    }
}