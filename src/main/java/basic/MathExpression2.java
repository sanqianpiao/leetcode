package basic;


import java.util.Stack;

public class MathExpression2 {

    public int calculate(String expression) {
        expression = removeParentheses(expression).replace("+", " + ").replace("-", " - ");
        String[] str = expression.split(" ");
        int sum = Integer.valueOf(str[0]);
        for (int i = 1; i < str.length - 1; i += 2) {
            String s = str[i];
            if (s.length() == 0) continue;
            if (str[i].equals("+")) {
                sum += Integer.valueOf(str[i + 1]);
            } else {
                sum -= Integer.valueOf(str[i + 1]);
            }
        }

        return sum;
    }

    public String removeParentheses(String expression) {
        Stack<Character> ps = new Stack<>();
        Stack<Integer> pIndices = new Stack<>();
        StringBuilder sb = new StringBuilder(expression);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                ps.push(ch);
                pIndices.push(i);
            } else if (ch == ')' && ps.peek() == '(') {
                ps.pop();
                int end = pIndices.pop();
                int from = pIndices.size() > 0 ? pIndices.peek() : 0;
                char lastOperator = lastOperator(sb, from, end);
                if (lastOperator == '-') {
                    flipOperator(sb, end, i);
                }
                sb.replace(i, i + 1, " ");
                sb.replace(end, end + 1, " ");
            }
        }

        return sb.toString().replace(" ", "");
    }

    private void flipOperator(StringBuilder expression, int from, int end) {
        for (int i = from; i < end; i++) {
            if (expression.charAt(i) == '+') expression.replace(i, i + 1, "-");
            else if (expression.charAt(i) == '-') expression.replace(i, i + 1, "+");
        }
    }

    private char lastOperator(CharSequence expression, int from, int end) {
        for (int i = end; i > from; i--) {
            if (expression.charAt(i) == '-') return '-';
            else if (expression.charAt(i) == '+') return '+';
        }
        return '+';
    }

}
