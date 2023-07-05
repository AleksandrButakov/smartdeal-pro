package config;

import org.aeonbits.owner.Config;
import java.net.URL;

@Config.Sources({
        "classpath:testing.properties"
})

public interface WebDriverConfig extends Config {

    @Key("webdriver.baseUrl")
    @DefaultValue("https://smartdeal.pro")
    String getWebDriverBaseUrl();

}
