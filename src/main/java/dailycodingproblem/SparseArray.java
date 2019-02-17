package dailycodingproblem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * You have a large array with most of the elements as zero.
 * <p>
 * Use a more space-efficient data structure, SparseArray, that implements the same interface:
 * <p>
 * init(arr, size): initialize with the original large array and size.
 * set(i, val): updates index at i with val.
 * get(i): gets the value at index i.
 */
public class SparseArray {

    private final ConcurrentMap<Integer, Integer> map = new ConcurrentHashMap<>();
    private final int size;

    public SparseArray(int[] arr, int size) {
        this.size = size;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) map.put(i, arr[i]);
        }
    }

    public void set(int i, int val) {
        if (map.size() >= this.size) throw new IllegalStateException("Exceeding the size of array");
        map.put(i, val);
    }

    public int get(int i) {
        return map.getOrDefault(i, 0);
    }
}
