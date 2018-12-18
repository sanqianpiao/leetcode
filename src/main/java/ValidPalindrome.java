public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() < 2) return true;
        int lo = 0, hi = s.length() - 1;

        while (lo < hi && lo < s.length() && hi > -1) {
            while (lo < s.length() && isAlphabet(s.charAt(lo)) == false) lo++;
            while (hi > -1 && isAlphabet(s.charAt(hi)) == false) hi--;

            if (hi < lo) return true;

            char left = toLower(s.charAt(lo));
            char right = toLower(s.charAt(hi));

            if (left != right) return false;

            lo++;
            hi--;
        }

        return true;
    }

    private boolean isAlphabet(char ch) {
        return (ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z');
    }

    private char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') return (char) (ch + ('a' - 'A'));
        return ch;
    }
}
