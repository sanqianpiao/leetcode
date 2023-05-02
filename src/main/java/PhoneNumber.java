import java.util.ArrayList;
import java.util.List;


public class PhoneNumber {
    public static List<String> letterCombinations(String digits) {
        String keyboard[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) return result;

        result.add("");
        for (int i = 0; i < digits.length(); i++)
            result = combine(keyboard[digits.charAt(i) - '0'], result);

        return result;
    }

    public static List<String> combine(String chars, List<String> prevResults) {
        List<String> newResults = new ArrayList<>();

        for (int i = 0; i < chars.length(); i++)
            for (String str : prevResults)
                newResults.add(str + chars.charAt(i));

        return newResults;
    }

    public static void main(String[] args) {
        List<String> strings = letterCombinations("23");
        System.out.println(strings);
    }
}
