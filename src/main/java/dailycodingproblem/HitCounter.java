package dailycodingproblem;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 *This question was asked by Riot Games.
 *
 * Design and implement a HitCounter class that keeps track of requests (or hits). It should support the following operations:
 *
 * record(timestamp): records a hit that happened at timestamp
 * total(): returns the total number of hits recorded
 * range(lower, upper): returns the number of hits that occurred between timestamps lower and upper (inclusive)
 * Follow-up: What if our system has limited memory?
 */
public class HitCounter {

    private AtomicLong total = new AtomicLong();
    private ConcurrentMap<Long, Long> map = new ConcurrentHashMap<>();

    private long toMinuties(long timestamp) {
        return timestamp / 1000 / 60;
    }

    public void record(long timestamp) {
        total.getAndIncrement();
        map.put(toMinuties(timestamp), total.get());
    }

    public long total() {
        return total.get();
    }

    public long range(long lower, long upper) {
        long lm = toMinuties(lower);
        while (lm > 0 && map.get(lm) == null) {
            lm--;
        }

        long um = toMinuties(upper);
        while (um > 0 && map.get(um) == null) {
            um--;
        }

        return map.getOrDefault(um, 0L) - map.getOrDefault(lm, 0L);
    }
}
