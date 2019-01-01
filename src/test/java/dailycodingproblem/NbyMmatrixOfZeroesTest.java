package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class NbyMmatrixOfZeroesTest {

    @Test
    public void numberOfPaths() {
        assertEquals(1, NbyMmatrixOfZeroes.numberOfPaths(1,1));
        assertEquals(2, NbyMmatrixOfZeroes.numberOfPaths(2,2));
        assertEquals(6, NbyMmatrixOfZeroes.numberOfPaths(3,3));
        assertEquals(70, NbyMmatrixOfZeroes.numberOfPaths(5,5));
        assertEquals(252, NbyMmatrixOfZeroes.numberOfPaths(6,6));
    }
}