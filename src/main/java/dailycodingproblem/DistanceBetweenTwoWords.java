package dailycodingproblem;

/**
 * Find an efficient algorithm to find the smallest distance (measured in number of words) between any two given words in a string.
 * <p>
 * For example, given words "hello", and "world" and a text content of "dog cat hello cat dog dog hello cat world", return 1 because there's only one word "cat" in between the two words.
 */
public class DistanceBetweenTwoWords {

    public int distance(String s, String w1, String w2) {
        String[] words = s.split("\\s");

        int min = Integer.MAX_VALUE;
        int i1 = -1, i2 = -1;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (w1.equals(word)) {
                i1 = i;
            } else if (w2.equals(word)) {
                i2 = i;
            }
            if (i1 > -1 && i2 > -1) {
                min = Math.min(Math.abs(i1 - i2) - 1, min);
            }
        }

        return min;
    }
}
