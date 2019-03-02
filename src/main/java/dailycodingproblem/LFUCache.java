package dailycodingproblem;

import java.util.*;

/**
 * This problem was asked by Google.
 * <p>
 * Implement an LFUCache (Least Frequently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:
 * <p>
 * set(key, value): sets key to value. If there are already n items in the cache and we are adding a new item, then it should also remove the least frequently used item. If there is a tie, then the least recently used key should be removed.
 * get(key): gets the value at key. If no such key exists, return null.
 * Each operation should run in O(1) time.
 * <p>
 * We will be sending the solution tomorrow, along with tomorrow's question. As always, feel free to shoot us an email if there's anything we can help with.
 */
public class LFUCache<K, V> {
    private int size;
    private int currentSize;
    private int min;
    private final Map<K, Integer> keyFreq;
    private final Map<Integer, LinkedHashMap<K, V>> freqMap;

    private LFUCache() {
        this.currentSize = 0;
        this.min = -1;
        keyFreq = new HashMap<>();
        freqMap = new HashMap<>();
    }

    public LFUCache(int size) {
        this();
        this.size = size;
    }

    public void set(K key, V value) {
        if (this.size == 0) return;

        //remove the eldest entry when cache is full
        if (this.currentSize == this.size) removeLFUCache();

        if (keyFreq.containsKey(key) == false) {
            this.currentSize++;

            //this entry does not exist before, so min must be 1
            this.min = 1;
        }

        update(key, value);
    }

    public V get(K key) {
        if (keyFreq.containsKey(key) == false) return null;
        Integer count = keyFreq.get(key);

        V value = freqMap.get(count).get(key);
        update(key, value);
        return value;
    }

    private void update(K key, V value) {
        Integer count = keyFreq.compute(key, (k, v) -> v == null ? 1 : v + 1);
        this.min = Math.min(min, count);

        //remove entry from previous count map
        freqMap.compute(count - 1, (k, v) -> {
            if (v != null)
                v.remove(key);
            return v;
        });

        if (count - 1 == min && freqMap.get(count - 1).isEmpty()) {
            this.min++;
        }

        //add entry to the new count map
        freqMap.compute(count, (k, v) -> {
            if (v == null) {
                v = new LinkedHashMap<>();
            }
            v.put(key, value);
            return v;
        });
    }

    private void removeLFUCache() {
        if (freqMap.containsKey(min) == false) return;
        this.currentSize--;
        Iterator<Map.Entry<K, V>> iterator = freqMap.get(min).entrySet().iterator();

        //The first entry is the eldest one
        Map.Entry<K, V> first = iterator.next();
        iterator.remove();
        keyFreq.remove(first.getKey());
    }

}
