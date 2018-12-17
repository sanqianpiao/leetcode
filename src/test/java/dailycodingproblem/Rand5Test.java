package dailycodingproblem;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Rand5Test {

    Rand5 rand = new Rand5();

    @Test
    public void rand7() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            int r = rand.rand7();
            map.compute(r, (k, v) -> v == null ? 1 : v + 1);
        }
        System.out.println(map);
    }

    @Test
    public void rand5() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            int r = rand.rand5();
            map.compute(r, (k, v) -> v == null ? 1 : v + 1);
        }
        System.out.println(map);
    }
}