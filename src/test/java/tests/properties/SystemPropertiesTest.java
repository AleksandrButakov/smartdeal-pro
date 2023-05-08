package tests.properties;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {
    @Test
    void simplePropertyTest() {
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simpleProperty1Test() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

}