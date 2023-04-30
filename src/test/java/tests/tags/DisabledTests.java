package tests.tags;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("needed")
public class DisabledTests {
    @Test
    @Disabled
    void test1() {
        assertTrue(false);
    }
    
    @Test
    @Disabled
    @Tag("prod")
    void test2() {
        assertTrue(false);
    }

}
