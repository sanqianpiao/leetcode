import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    PascalTriangle pt = new PascalTriangle();

    @Test
    public void generate() {
        List<List<Integer>> generate = pt.generate(5);
        System.out.println(generate);
    }
}