package sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int p = partition(a, lo, hi);
        sort(a, lo, p - 1);
        sort(a, p, hi);
    }

    private static int partition(int[] a, int lo, int hi) {
        int p = a[hi];
        while (lo < hi) {
            while (a[lo] < p) lo++;
            while (a[hi] > p) hi--;
            if (lo < hi) {
                int t = a[lo];
                a[lo] = a[hi];
                a[hi] = t;
                lo++;
                hi--;
            }
        }
        return lo;
    }

    public static void main(String[] args) {

        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) a[i] = ThreadLocalRandom.current().nextInt(10);

        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
