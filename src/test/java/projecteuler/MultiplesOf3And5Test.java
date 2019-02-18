package projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOf3And5Test {

    MultiplesOf3And5 inst = new MultiplesOf3And5();

    @Test
    public void calculate() {
        assertEquals(23, inst.calculate(10));
        System.out.println(inst.calculate(1000));
    }
}