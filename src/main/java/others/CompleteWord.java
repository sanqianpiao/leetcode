package others;

public class CompleteWord {

    public String complete(String s, int n) {
        if (n == s.length()) return s;
        int hi = n + 1 <= s.length() - 1 ? n + 1 : n;
        while (hi > -1 && s.charAt(hi) != ' ') hi--;
        if (hi == -1) return null;
        return s.substring(0, hi);
    }
}
