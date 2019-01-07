public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return (isPalindromeRange(s, lo + 1, hi) ||
                        isPalindromeRange(s, lo, hi - 1));
            }
            lo++;
            hi--;
        }
        return true;
    }

    public boolean isPalindromeRange(String s, int lo, int hi) {
        while (lo < hi) {
            if (s.charAt(lo++) != s.charAt(hi--)) return false;
        }
        return true;
    }
}
