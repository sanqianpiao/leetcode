package dailycodingproblem;

/**
 * This problem was asked by Facebook.
 * <p>
 * Write a function that rotates a list by k elements.
 * For example, [1, 2, 3, 4, 5, 6] rotated by two becomes [3, 4, 5, 6, 1, 2].
 * Try solving this without creating a copy of the list.
 * How many swap or move operations do you need?
 */
public class RorateArray {

    public void rorate(int[] a, int k) {

        int[] tmp = new int[k];
        //save the first k elements to tmp array
        for(int i = 0; i < k; i++) {
            tmp[i] = a[i];
        }

        //move the remaining elements to the start of the original array
        for(int i = 0; i < a.length - k; i++) {
            a[i] = a[i + k];
        }

        //copy the elements to the end of the original array
        for(int i = 0; i < k; i++) {
            a[a.length - k + i] = tmp[i];
        }
    }
}
