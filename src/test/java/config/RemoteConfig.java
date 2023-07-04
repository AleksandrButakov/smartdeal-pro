package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:testing.properties"
})

public interface RemoteConfig extends Config {

    @Key("webdriver.baseUrl")
    String getWebDriverBaseUrl();

}
