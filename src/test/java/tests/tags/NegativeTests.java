package tests.tags;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("negative")
public class NegativeTests {
    @Test
    @Disabled
    void test1() {
        assertTrue(false);
    }
    
    @Test
    @Disabled
    void test2() {
        assertTrue(false);
    }

    @Test
    @Disabled
    @Tag("smoke")
    void test3() {
        assertTrue(false);
    }

    @Test
    @Disabled
    @Tag("smoke")
    void test4() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test5() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test6() {
        assertTrue(false);
    }
    
}
