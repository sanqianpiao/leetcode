package dailycodingproblem;

/**
 * This problem was asked by Microsoft.
 * <p>
 * A number is considered perfect if its digits sum up to exactly 10.
 * <p>
 * Given a positive integer n, return the n-th perfect number.
 * <p>
 * For example, given 1, you should return 19. Given 2, you should return 28.
 */
public class NthPerfectNumber {

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public int perfect(int n) {
        int perfect = 19;
        for (int count = 0; ; perfect += 9) {
            if (sumOfDigits(perfect) == 10) count++;
            if (count == n) return perfect;
        }
    }
}
