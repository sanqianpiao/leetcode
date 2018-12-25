public class RepeatedStringPattern {
    public boolean repeatedSubstringPattern(String s) {

        for (int i = 1; i < s.length() / 2 + 1; i++) {
            String sub = s.substring(0, i);
            if (isRepeat(sub, s)) return true;
        }
        return false;
    }

    private boolean isRepeat(String sub, String s) {
        for (int i = 0; i < s.length(); i += sub.length()) {
            int j = 0;
            for (; j < sub.length() && i + j < s.length(); j++) {
                if (sub.charAt(j) != s.charAt(i + j)) return false;
            }
            if (j != sub.length()) return false;
        }
        return true;
    }

    public boolean repeatedSubstringPattern2(String s) {
        String ss = s + s;
        return ss.substring(1, ss.length() - 1).indexOf(s) > -1;
    }
}
