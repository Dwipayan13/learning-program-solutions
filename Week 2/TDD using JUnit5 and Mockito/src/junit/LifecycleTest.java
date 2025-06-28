package junit;

import org.junit.jupiter.api.*;

public class LifecycleTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setup() {
        System.out.println("Before each test");
    }

    @Test
    void testOne() {
        System.out.println("Running test one");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After all tests");
    }
}
