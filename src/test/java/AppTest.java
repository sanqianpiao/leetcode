/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());

        List<Integer> list = new ArrayList<>();
        list.stream().mapToInt(Integer::intValue).toArray();

    }

}
