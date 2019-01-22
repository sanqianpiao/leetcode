import java.util.Stack;

/**
 * Example 1:
 * <p>
 * Input: "3+2*2"
 * Output: 7
 * Example 2:
 * <p>
 * Input: " 3/2 "
 * Output: 1
 * Example 3:
 * <p>
 * Input: " 3+5 / 2 "
 * Output: 5
 */
public class BasicCalculatorII {

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
}
