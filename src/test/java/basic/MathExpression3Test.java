package basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathExpression3Test {

    MathExpression3 inst = new MathExpression3();

    @Test
    public void calculate() {
        assertEquals(2, inst.calculate("6+9-13"));
        assertEquals(255, inst.calculate("255"));

        assertEquals(23, inst.calculate("(1+(4+5+2)-3)+(6+8)"));
        assertEquals(255, inst.calculate("((255))"));
        assertEquals(11, inst.calculate("(7)-(0)+(4)"));
        assertEquals(3, inst.calculate("2-(5-6)"));
    }
}