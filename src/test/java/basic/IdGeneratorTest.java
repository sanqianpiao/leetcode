package basic;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class IdGeneratorTest {

    IdGenerator inst;

    AtomicInteger seq = new AtomicInteger(0);

    @Before
    public void setUp() throws Exception {
        inst = new IdGenerator(1023);
    }

    @Test
    public void nextId() {
        Set<Long> set = Collections.synchronizedSet(new HashSet<>());

        int n = 5000;
        IntStream.range(0, n).parallel().forEach(i -> {
            set.add(inst.nextId());
        });

        assertEquals(n, set.size());
    }

    @Test
    public void name() {
        int n = 4095;
        Set<Long> set = Collections.synchronizedSet(new HashSet<>());
        IntStream.range(0, n).parallel().forEach(i -> {

            long id = System.currentTimeMillis() << 22 | 1023 << 12 | seq.getAndIncrement();
            set.add(id);
        });

        assertEquals(n, set.size());
    }
}