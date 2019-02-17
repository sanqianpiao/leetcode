package projecteuler;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {

    public int largeset(int digits) {
        int max = 0, min = 9 * (int) Math.pow(10, digits - 1);
        while (digits > 0) {
            max = max * 10 + 9;
            digits--;
        }
        int p = max * max;
        while (p >= min * min) {
            if (isPalindrome(p)) {
                for (int m = max; m >= min; m--) {
                    if (p % m == 0 && p / m >= min && p / m <= max) {
                        System.out.println(p + " = " + m + " * " + (p / m));
                        return p;
                    }
                }
            }
            p--;
        }
        return p;
    }

    private boolean isPalindrome(int n) {
        String s = n + "";
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) return false;
        }
        return true;
    }
}
