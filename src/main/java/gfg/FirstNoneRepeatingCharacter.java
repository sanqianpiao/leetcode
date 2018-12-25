package gfg;

public class FirstNoneRepeatingCharacter {

    public int first(String s) {
        char[] a = new char[256];
        for (char ch : s.toCharArray()) {
            a[ch]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (a[s.charAt(i)] == 1) return i;
        }
        return -1;
    }
}
