package dailycodingproblem;

import java.util.ArrayList;
import java.util.List;

/**
 * This problem was asked by Square.
 * <p>
 * Given a list of words, return the shortest unique prefix of each word. For example, given the list:
 * <p>
 * dog
 * cat
 * apple
 * apricot
 * fish
 * Return the list:
 * <p>
 * d
 * c
 * app
 * apr
 * f
 */
public class ShortestUniquePrefix {

    public List<String> uniquePrefix(List<String> words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append("|").append(word);
        }

        List<String> list = new ArrayList<>();
        for (String word : words) {

            for (int i = 1; i < word.length(); i++) {
                String prefix = word.substring(0, i);
                int idx1 = sb.indexOf("|" + prefix);
                int idx2 = sb.indexOf("|" + prefix, idx1 + 1);
                if (idx1 > -1 && idx2 == -1) {
                    list.add(prefix);
                    break;
                }
            }
        }
        return list;
    }
}
