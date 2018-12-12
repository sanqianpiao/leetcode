package dailycodingproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * This problem was asked by Google.
 * <p>
 * Implement an LFU (Least Frequently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:
 * <p>
 * set(key, value): sets key to value. If there are already n items in the cache and we are adding a new item, then it should also remove the least frequently used item. If there is a tie, then the least recently used key should be removed.
 * get(key): gets the value at key. If no such key exists, return null.
 * Each operation should run in O(1) time.
 * <p>
 * We will be sending the solution tomorrow, along with tomorrow's question. As always, feel free to shoot us an email if there's anything we can help with.
 */
public class LFU<K, V> {
    private int size;
    private final PriorityQueue<FrequencyAssessTimeValue> q;
    private final Map<K, FrequencyAssessTimeValue<K, V>> map;

    public LFU(int size) {
        this.size = size;
        q = new PriorityQueue<>();
        map = new HashMap<>();
    }

    public void set(K key, V value) {
        if (q.size() == this.size) {
            FrequencyAssessTimeValue poll = q.poll();
            map.remove(poll.key);
        }

        FrequencyAssessTimeValue<K, V> fav = new FrequencyAssessTimeValue<>(key, value);
        map.put(key, fav);
        q.add(fav);
    }

    public V get(K key) {
        FrequencyAssessTimeValue<K, V> fav = map.get(key);
        if (fav == null) return null;
        fav.increaseFrequency();
        q.remove(fav);
        q.add(fav);
        return fav.v;
    }

    static class FrequencyAssessTimeValue<K, V> implements Comparable<FrequencyAssessTimeValue> {
        K key;
        V v;
        int frequency;
        long lastAccessTime;

        public FrequencyAssessTimeValue(K k, V v) {
            this.key = k;
            this.v = v;
            this.frequency = 0;
            this.lastAccessTime = System.nanoTime();
        }

        public void increaseFrequency() {
            this.frequency++;
        }

        @Override
        public int compareTo(FrequencyAssessTimeValue o) {
            if (this.frequency > o.frequency) return 1;
            else if (this.frequency < o.frequency) return -1;
            else if (this.lastAccessTime > o.lastAccessTime) return 1;
            else return -1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FrequencyAssessTimeValue<?, ?> that = (FrequencyAssessTimeValue<?, ?>) o;
            return key.equals(that.key) &&
                    v.equals(that.v);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, v);
        }

        @Override
        public String toString() {
            return "FrequencyAssessTimeValue{" +
                    "v=" + v +
                    ", frequency=" + frequency +
                    ", lastAccessTime=" + lastAccessTime +
                    '}';
        }
    }
}
