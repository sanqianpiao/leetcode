package projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenFibonacciNumbersTest {

    EvenFibonacciNumbers inst = new EvenFibonacciNumbers();

    @Test
    public void evenSum() {
        assertEquals(2, inst.evenSum(2));
        assertEquals(10, inst.evenSum(8));
        System.out.println(inst.evenSum(4_000_000));
    }
}