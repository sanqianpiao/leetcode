public class LongestSubstringWithoutRepeatingCharacter {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), max = 0;
        int[] index = new int[26]; // current index of character
        // try to extend the range [i, j]
        for (int hi = 0, lo = 0; hi < n; hi++) {
            int ch = s.charAt(hi) - 'a';
            lo = Math.max(index[ch], lo);
            max = Math.max(max, hi - lo + 1);
            index[ch] = hi + 1;
        }
        return max;
    }
}
