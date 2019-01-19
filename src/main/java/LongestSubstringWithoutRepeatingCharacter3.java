import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter3 {
    public int lengthOfLongestSubstring(String s) {
        int lo = 0, hi = 0, max = 1;
        Set<Character> set = new HashSet<>();
        while (hi < s.length()) {
            char ch = s.charAt(hi);
            if (set.contains(ch) == false) {
                set.add(ch);
                max = Math.max(max, hi - lo + 1);
                hi++;
            } else {
                set.remove(s.charAt(lo));
                lo++;
            }
        }
        return max;
    }
}
