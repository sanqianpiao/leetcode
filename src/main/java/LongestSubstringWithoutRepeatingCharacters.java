public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), max = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int hi = 0, lo = 0; hi < n; hi++) {
            lo = Math.max(index[s.charAt(hi)], lo);
            max = Math.max(max, hi - lo + 1);
            index[s.charAt(hi)] = hi + 1;
        }
        return max;
    }
}
