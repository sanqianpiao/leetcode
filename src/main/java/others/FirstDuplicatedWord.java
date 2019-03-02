package others;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicatedWord {

    public String duplicatedWord(String s) {
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                sb.append(ch);
            }

            if (sb.length() > 0 && (!Character.isLetter(ch) || i == s.length() - 1)) {
                if (sb.length() > 1) {
                    String word = sb.toString().toLowerCase();
                    map.compute(word, (k, v) -> v == null ? 1 : v + 1);
                }
                sb.delete(0, sb.length());
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) return entry.getKey();
        }

        return null;
    }

}
