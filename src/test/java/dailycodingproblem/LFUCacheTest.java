package dailycodingproblem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LFUCacheTest {

    LFUCache<String, String> lfu;

    @Before
    public void setUp() throws Exception {
        lfu = new LFUCache(3);
    }

    @Test
    public void name() {
        for (int i = 0; i < 10; i++) {
            lfu.set("key: " + i, "value: " + i);
            lfu.get("key: 0");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(lfu.get("key: " + i));
            if (i == 0) assertNotNull(lfu.get("key: " + i));
        }
    }
}