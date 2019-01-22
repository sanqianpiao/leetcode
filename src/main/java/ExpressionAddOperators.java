import java.util.*;

/**
 * Example 1:
 * <p>
 * Input: num = "123", target = 6
 * Output: ["1+2+3", "1*2*3"]
 * Example 2:
 * <p>
 * Input: num = "232", target = 8
 * Output: ["2*3+2", "2+3*2"]
 * Example 3:
 * <p>
 * Input: num = "105", target = 5
 * Output: ["1*0+5","10-5"]
 * Example 4:
 * <p>
 * Input: num = "00", target = 0
 * Output: ["0+0", "0-0", "0*0"]
 * Example 5:
 * <p>
 * Input: num = "3456237490", target = 9191
 * Output: []
 */
public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        if (target == Integer.MIN_VALUE) return Collections.emptyList();

        char[] signs = {'+', '-', '*'};

        List<List<String>> combs = new ArrayList<>();
        numberHelper(combs, new ArrayList<>(), num, 0);

        System.out.println(combs);

        List<String> expressions = new ArrayList<>();
        for (List<String> nums : combs) {
            operatorHelper(expressions, "", nums, 0, signs);
        }
        System.out.println(expressions);

        List<String> res = new ArrayList<>();
        for (String expression : new HashSet<>(expressions)) {
            if (calculate(expression) == target) {
                res.add(expression);
            }
        }
        return res;
    }

    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        s = s.replaceAll("\\s", "");

        Stack<Integer> stack = new Stack<>();
        int len = s.length();
        int num = 0;
        char lastSign = '+';

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + ch - '0';
            }

            if (!Character.isDigit(ch) || i == len - 1) {
                if (lastSign == '-') {
                    stack.push(-num);
                } else if (lastSign == '+') {
                    stack.push(num);
                } else if (lastSign == '*') {
                    stack.push(stack.pop() * num);
                } else if (lastSign == '/') {
                    stack.push(stack.pop() / num);
                }
                lastSign = ch;
                num = 0;
            }
        }

        int res = 0;
        for (int n : stack) {
            res += n;
        }
        return res;
    }

    public void numberHelper(List<List<String>> combs, List<String> comb, String num, int start) {
        if (start >= num.length()) {
            combs.add(new ArrayList(comb));
            return;
        }
        for (int i = start; i < num.length(); i++) {
            String sub = num.substring(start, i + 1);
            if (sub.startsWith("0") && sub.length() > 1) continue;
            comb.add(sub);
            numberHelper(combs, comb, num, i + 1);
            comb.remove(comb.size() - 1);
        }
    }


    public void operatorHelper(List<String> combs, String comb, List<String> nums, int numStart, char[] signs) {
        StringBuilder sb = new StringBuilder();
        for (int i = numStart; i < nums.size(); i++) {
            String num = nums.get(i);
            //skip 1/0 condition
            if (comb.length() > 0 && comb.charAt(comb.length() - 1) == '/' && "0".equals(nums.get(i))) continue;

            sb.append(num);
            if (i == nums.size() - 1) {
                combs.add(comb + sb.toString());
                return;
            }
            for (int j = 0; j < signs.length; j++) {
                sb.append(signs[j]);
                operatorHelper(combs, comb + sb.toString(), nums, i + 1, signs);
                sb.deleteCharAt(sb.length() - 1);
            }
            return;
        }
    }
}
