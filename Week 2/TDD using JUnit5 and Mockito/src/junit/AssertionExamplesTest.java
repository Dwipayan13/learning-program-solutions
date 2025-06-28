package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionExamplesTest {

    @Test
    void testAssertions() {
        assertTrue(10 > 5);
        assertFalse(5 > 10);
        assertEquals("Hello", "Hello");
        assertNotNull("Java");
        assertNull(null);
    }
}
