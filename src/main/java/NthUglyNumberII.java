import java.util.Arrays;

public class NthUglyNumberII {

    public int nthUglyNumber(int n) {
        int[] p = {2, 3, 5};
        int[] indices = new int[p.length];
        int[] k = new int[n];
        k[0] = 1;

        for (int i = 1; i < n; i++) {
            k[i] = nextMin(p, indices, k, i);
        }

        return k[n - 1];
    }

    public int nextMin(int[] p, int[] indices, int[] k, int curr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < p.length; i++) {
            int res = p[i] * k[indices[i]];
            min = Math.min(min, res);
        }

        for (int i = 0; i < p.length; i++) {
            int res = p[i] * k[indices[i]];
            if (min == res) indices[i]++;
        }
        System.out.println(Arrays.toString(indices));
        return min;
    }
}
