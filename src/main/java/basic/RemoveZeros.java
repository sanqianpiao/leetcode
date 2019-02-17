package basic;

/**
 * [1, 0, 2, 0, 3, 0] 6=> [1, 2, 3, 0, 0, 0] 3
 */
public class RemoveZeros {

    public int remove(int[] a, int len) {
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] != 0) {
                if (i != j) {
                    a[j] = a[i];
                    a[i] = 0;
                }
                j++;
            }
        }
        return j;
    }
}
