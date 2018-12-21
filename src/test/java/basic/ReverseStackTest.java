package basic;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class ReverseStackTest {

    ReverseStack inst = new ReverseStack();

    @Test
    public void reverse() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        inst.reverse(stack);

        while (stack.isEmpty() == false)
            System.out.println(stack.pop());
    }
}