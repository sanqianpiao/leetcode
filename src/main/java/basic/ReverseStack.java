package basic;

import java.util.Stack;

public class ReverseStack {

    public void reverse(Stack stack) {
        if (stack.isEmpty()) return;
        Object pop = stack.pop();
        reverse(stack);
        insertAtBottom(stack, pop);
    }

    private void insertAtBottom(Stack stack, Object value) {
        if (stack.isEmpty()) {
            stack.push(value);
        } else {
            Object t = stack.pop();
            insertAtBottom(stack, value);
            stack.push(t);
        }
    }

}
