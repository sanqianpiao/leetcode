import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    RotateImage inst = new RotateImage();

    @Test
    public void rotate() {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        inst.rotate(m);
    }
}