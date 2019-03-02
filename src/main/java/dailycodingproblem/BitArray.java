package dailycodingproblem;

/**
 * This problem was asked by Amazon.
 * <p>
 * Implement a bit array.
 * <p>
 * A bit array is a space efficient array that holds a value of 1 or 0 at each index.
 * <p>
 * init(size): initialize the array with size
 * set(i, val): updates index at i with val where val is either 1 or 0.
 * get(i): gets the value at index i.
 */
public class BitArray {

    final boolean[] arr;

    public BitArray(int size) {
        arr = new boolean[size];
    }

    private void checkBoundary(int i) {
        if (i < 0 || i >= arr.length) throw new IllegalArgumentException();
    }

    public void set(int i, int val) {
        checkBoundary(i);
        arr[i] = val == 1;
    }

    public int get(int i) {
        checkBoundary(i);
        return arr[i] ? 1 : 0;
    }
}
