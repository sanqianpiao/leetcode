package projecteuler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {

    public long maxPrime(long n) {
        long maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n >>= 1;
        }

        for (int i = 3; i < Math.sqrt(n); i += 2) {
            while (n % i == 0) {
//                maxPrime = n;
                n /= i;
            }
        }
        if (n > 2) maxPrime = n;

        return maxPrime;
    }
}
