package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClockwiseSpiralTest {

    @Test
    public void print() {
        int[][] a = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};

        new ClockwiseSpiral().print(a);
    }
}