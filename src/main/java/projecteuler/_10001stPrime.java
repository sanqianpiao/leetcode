package projecteuler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 */
public class _10001stPrime {

    public int prime(int nth) {
        int[] p = new int[nth < 2 ? 2 : nth];
        p[0] = 2;
        p[1] = 3;
        int i = 1;
        while (nth > 2 && i < nth - 1) {
            int n = p[i] + 2;

            for (int j = 1; j <= i; j++) {
                if (n % p[j] == 0) {
                    n += 2;
                    j = 0;
                }
            }

            p[++i] = n;
        }
        return p[nth - 1];
    }
}
