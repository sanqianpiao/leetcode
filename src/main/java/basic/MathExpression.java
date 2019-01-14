package basic;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MathExpression {

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

        return sb.toString();
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


    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Deque<Character> queue = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            queue.offerLast(c);
        }
        return eval(queue);
    }

    private int eval(Deque<Character> queue) {
        int sum = 0;
        boolean minus = false;
        while (!queue.isEmpty()) {
            char c = queue.pollFirst();
            switch (c) {
                case ')':
                    return sum;
                case '(':
                    if (minus) {
                        sum -= eval(queue);
                    } else {
                        sum += eval(queue);
                    }
                    break;
                case '+':
                    minus = false;
                    break;
                case '-':
                    minus = true;
                    break;
                default:
                    // skip empty spaces
                    if (!Character.isDigit(c)) {
                        continue;
                    }
                    if (minus) {
                        sum -= getNumber(c, queue);
                    } else {
                        sum += getNumber(c, queue);
                    }
            }
        }

        return sum;
    }

    private int getNumber(char c, Deque<Character> queue) {
        int sum = c - '0';
        while (queue.size() > 0 && Character.isDigit(queue.peek())) {
            sum *= 10;
            sum += queue.poll() - '0';
        }
        return sum;
    }


}
