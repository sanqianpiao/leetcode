package dailycodingproblem;

import java.util.Arrays;

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

    private final int size;
    private int currSize = 0;
    private final int DEFAULT_IF_NOT_FOUND = 0;
    private final int[] keys;
    private final int[] values;

    public SparseArray(int[] arr, int size) {
        this.size = size;
        keys = new int[size];
        values = new int[size];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                set(i, arr[i]);
            }
        }
    }

    public void set(int key, int val) {
        if (currSize >= size) throw new IllegalStateException("Array is full");
        if (key <= keys[currSize]) throw new IllegalArgumentException("Invalid key value");
        keys[currSize] = key;
        values[currSize] = val;
        currSize++;
    }

    public int get(int key) {
        int i = Arrays.binarySearch(keys, 0, currSize, key);
        if (i >= 0) return values[i];
        return DEFAULT_IF_NOT_FOUND;
    }
}
