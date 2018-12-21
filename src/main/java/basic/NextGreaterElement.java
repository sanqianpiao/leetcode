package basic;

import java.util.Stack;

public class NextGreaterElement {

    public void next(int[] a) {
        Stack<Integer> stack = new Stack<>();
        stack.push(a[0]);
        for (int i = 1; i < a.length; i++) {
            while (stack.size() > 0 && stack.peek() < a[i]) {
                System.out.println(stack.pop() + " - " + a[i]);
            }

            stack.push(a[i]);

            if (i == a.length - 1) {
                System.out.println(a[i] + " - " + -1);
            }
        }

    }
}
