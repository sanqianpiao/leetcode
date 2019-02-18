package others;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CitiesAndContinentsTest {

    CitiesAndContinents inst = new CitiesAndContinents();

    @Test
    public void continents() {
        List<int[]> ints = Arrays.asList(new int[]{2, 1}, new int[]{4, 3}, new int[]{3, 2}, new int[]{5, 6});
        int continents = inst.continents(ints);
        assertEquals(2, continents);
    }
}