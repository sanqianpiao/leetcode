package projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPrimeFactorTest {

    LargestPrimeFactor inst = new LargestPrimeFactor();

    @Test
    public void maxPrime() {
        assertEquals(29, inst.maxPrime(13195));
        System.out.println(inst.maxPrime(600851475143L));
    }
}