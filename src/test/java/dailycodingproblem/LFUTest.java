package dailycodingproblem;

import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class LFUTest {

    LFU<String, String> lfu;

    @Before
    public void setUp() throws Exception {
        lfu = new LFU(3);
    }

    @Test
    public void comparator() {
        PriorityQueue<LFU.FrequencyAssessTimeValue> q = new PriorityQueue<>();
        q.add(new LFU.FrequencyAssessTimeValue("a", "aaa"));
        q.add(new LFU.FrequencyAssessTimeValue("b", "bbb"));
        q.add(new LFU.FrequencyAssessTimeValue("c", "ccc"));

        while (q.size() > 0) {
            System.out.println(q.poll());
        }
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