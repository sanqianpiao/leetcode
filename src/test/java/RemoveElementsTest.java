import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementsTest {

    RemoveElements re = new RemoveElements();

    @Test
    public void removeElement() {
        int[] a = {3, 2, 2, 3};
        int len = re.removeElement(a, 3);
        assertEquals(2, len);
        assertEquals(2, a[0]);
        assertEquals(2, a[1]);
    }

    @Test
    public void removeElement2() {
        int[] a = {0, 1, 2, 2, 3, 0, 4, 2};
        int len = re.removeElement(a, 2);
        assertEquals(5, len);
        assertEquals(0, a[0]);
        assertEquals(1, a[1]);
        assertEquals(3, a[2]);
    }

}